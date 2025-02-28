package gabrielramos.screenmatch.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import gabrielramos.screenmatch.titles.Title;
import gabrielramos.screenmatch.titles.TitleOmdb;
import gabrielramos.screenmatch.titles.exception.RuntimeCollectErrorException;
import org.w3c.dom.ls.LSOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy (FieldNamingPolicy. UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        List<Title> titles = new ArrayList<>();
        String filmName = "";

        System.out.println("Quando desejar finalizar as pesquisas digite 'sair'!");

        while (!filmName.equalsIgnoreCase("sair")){

            System.out.println("Digite o nome do filme: ");
            filmName = scanner.nextLine().replaceAll(" ", "+");

            if (filmName.equalsIgnoreCase("sair")){
                break;
            }

            try{
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://www.omdbapi.com/?t=" + filmName + "&apikey=d9c47cc8"))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);

                Title title = new Title(titleOmdb);

                titles.add(title);

            } catch (RuntimeCollectErrorException error){
                System.out.println(error.getMessage());
            } catch (RuntimeException error) {
                System.out.println("Erro: " + error.getMessage());;
            }
        }
        FileWriter fileWriter = new FileWriter("Films.json");
        fileWriter.write(gson.toJson(titles));
        fileWriter.close();

        System.out.println(titles);
        System.out.println("Programa finalizado!");
    }

}

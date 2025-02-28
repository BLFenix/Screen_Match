package gabrielramos.screenmatch.titles.exception;

public class RuntimeCollectErrorException extends RuntimeException {
    private String errorMessage;

    public RuntimeCollectErrorException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}

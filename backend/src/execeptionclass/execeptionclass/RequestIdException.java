public class RequestIdException extends Exception {
    public RequestIdException() {
        super("Request Id not found");
    }

    public RequestIdException(String message) {
        super(message);
    }

}
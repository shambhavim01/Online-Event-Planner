public class AdminIdException extends RuntimeException {
    public AdminIdException() {
        super("Id invalid");
    }

    public AdminIdException(String message) {
        super(message);
    }
}

public class UsernameException extends RuntimeException {
    public UsernameException() {
        super("Username invalid");
    }

    public UsernameException(String message) {
        super(message);
    }
}

public class PasswordException extends RuntimeException {
    public PasswordException() {
        super("Password invalid");
    }

    public PasswordException(String message) {
        super(message);
    }
}

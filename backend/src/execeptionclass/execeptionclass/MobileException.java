public class MobileException extends RuntimeException {
    public MobileException() {
        super("Mobile invalid");
    }

    public MobileException(String message) {
        super(message);
    }
}
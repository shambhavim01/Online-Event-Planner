public class VendorIdException extends Exception {
    public VendorIdException() {
        super("VendorId is  not valid");
    }

    public VendorIdException(String message) {
        super(message);
    }
}

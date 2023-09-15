public class DateException extends Exception {
    public DateException() {
        super("Date should be after current date");
    }

    public DateException(String message) {
        super(message);
    }

}

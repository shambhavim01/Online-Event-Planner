public class AttendeesException extends RuntimeException {
    public AttendeesException() {
        super("Number of attendees can maximum be 30");
    }

    public AttendeesException(String message) {
        super(message);
    }
}

public class DataAccessException extends RuntimeException {

    public DataAccessException() {
        super("Data can't be  accessed");
    }

    public DataAccessException(String message) {
        super(message);
    }

}

import java.sql.SQLException;

class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String message, SQLException cause) {
        super(message, cause);
    }
}
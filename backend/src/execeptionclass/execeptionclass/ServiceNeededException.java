public class ServiceNeededException extends Exception {
    public ServiceNeededException() {
        super("Service mentioned not found");
    }

    public ServiceNeededException(String message) {
        super(message);
    }
}

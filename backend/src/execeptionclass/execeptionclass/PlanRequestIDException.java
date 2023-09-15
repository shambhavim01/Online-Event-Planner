public class PlanRequestIDException extends Exception {
    public PlanRequestIDException() {
        super("Plan request id do  not match to any Request Id");
    }

    public PlanRequestIDException(String message) {
        super(message);
    }
}

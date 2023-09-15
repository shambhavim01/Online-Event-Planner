public class QuotationIdException extends Exception {
    public QuotationIdException() {
        super("Quotation id do  not valid");
    }

    public QuotationIdException(String message) {
        super(message);
    }
}

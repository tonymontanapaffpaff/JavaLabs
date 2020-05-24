package by.gsu.pms.exceptions;

public class RecordAndExtractException extends Exception {

    public RecordAndExtractException() {
    }

    public RecordAndExtractException(String message) {
        super(message);
    }

    public RecordAndExtractException(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordAndExtractException(Throwable cause) {
        super(cause);
    }
}

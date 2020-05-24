package by.gsu.pms.exceptions;

public class LogicalException extends IllegalArgumentException {

    public LogicalException() {
    }

    public LogicalException(String s) {
        super(s);
    }

    public LogicalException(String message, Throwable cause) {
        super(message, cause);
    }
}

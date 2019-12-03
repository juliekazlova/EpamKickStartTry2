package geometry.com.epam.exception;

public class NotPointException extends Exception {
    public NotPointException() {
    }

    public NotPointException(String message) {
        super(message);
    }

    public NotPointException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPointException(Throwable cause) {
        super(cause);
    }

    public NotPointException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

package geometry.com.epam.exception;

public class NotTriangleException extends Exception {
    public NotTriangleException() {
    }

    public NotTriangleException(String message) {
        super(message);
    }

    public NotTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotTriangleException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

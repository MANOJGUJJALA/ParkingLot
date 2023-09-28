package exception;

public class parkingSpotNotFoundException extends RuntimeException{
    public parkingSpotNotFoundException() {
    }

    public parkingSpotNotFoundException(String message) {
        super(message);
    }

    public parkingSpotNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public parkingSpotNotFoundException(Throwable cause) {
        super(cause);
    }

    public parkingSpotNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package exception;

public class parkingLotNotFoundException extends RuntimeException{

    public parkingLotNotFoundException() {
    }

    public parkingLotNotFoundException(String message) {
        super(message);
    }

    public parkingLotNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public parkingLotNotFoundException(Throwable cause) {
        super(cause);
    }

    public parkingLotNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

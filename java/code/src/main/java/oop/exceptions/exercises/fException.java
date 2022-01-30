package oop.exceptions.exercises;

public class fException extends Exception {
    public fException() {
        super();
    }

    public fException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public fException(String message, Throwable cause) {
        super(message, cause);
    }

    public fException(String message) {
        super(message);
    }

    public fException(Throwable cause) {
        super(cause);
    }

}
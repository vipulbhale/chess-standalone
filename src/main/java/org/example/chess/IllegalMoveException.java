package org.example.chess;

public class IllegalMoveException extends Exception {
    public IllegalMoveException() {
        super();
    }

    public IllegalMoveException(String message) {
        super(message);
    }

    public IllegalMoveException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalMoveException(Throwable cause) {
        super(cause);
    }

    protected IllegalMoveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

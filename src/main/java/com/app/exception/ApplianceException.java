package com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ApplianceException extends RuntimeException {
    private static final long serialVersionUID = 2696264181915285782L;

    public ApplianceException(String message) {
        super(message);
    }

    public ApplianceException(Exception exception, String message) {
        super(message, exception);
    }
    public ApplianceException( String message,Exception exception) {
        super(message, exception);
    }
}

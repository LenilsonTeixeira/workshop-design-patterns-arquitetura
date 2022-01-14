package com.treinamento.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends BaseException {

    private static final long serialVersionUID = 1L;

    public UserNotFoundException(String message){
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}

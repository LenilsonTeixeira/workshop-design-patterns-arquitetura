package com.treinamento.exception;

import org.springframework.http.HttpStatus;

public class AddUserException extends BaseException {

    private static final long serialVersionUID = 1L;

    public AddUserException(String message){
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}

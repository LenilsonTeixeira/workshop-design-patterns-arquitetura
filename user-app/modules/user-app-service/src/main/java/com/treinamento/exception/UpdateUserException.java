package com.treinamento.exception;

import org.springframework.http.HttpStatus;

public class UpdateUserException extends BaseException {

    private static final long serialVersionUID = 1L;

    public UpdateUserException(String message){
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}

package com.treinamento.handler;

import com.treinamento.exception.BaseException;
import com.treinamento.handler.model.ErrorResponse;
import com.treinamento.handler.model.FieldResponse;
import com.treinamento.utils.FieldTranslator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleBaseException(final BaseException exception, final HttpServletRequest request) {

        final ErrorResponse error = ErrorResponse
                .builder()
                .status(exception.getStatus().value())
                .error(exception.getStatus().name())
                .message(exception.getMessage())
                .timestamp(Instant.now().toEpochMilli())
                .path(request.getServletPath())
                .build();

        return ResponseEntity.status(error.getStatus())
                .body(error);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(final Exception exception, final HttpServletRequest request) {
        return ErrorResponse.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .error(HttpStatus.INTERNAL_SERVER_ERROR.name())
                .message(exception.getMessage())
                .timestamp(Instant.now().toEpochMilli())
                .path(request.getServletPath())
                .build();

    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleArgumentNotValidException(final MethodArgumentNotValidException exception, final HttpServletRequest request) {

        final ErrorResponse errorResponse = ErrorResponse.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .path(request.getServletPath())
                .build();

        exception.getBindingResult().getFieldErrors().forEach(error -> {
            final FieldResponse field = FieldResponse.builder()
                    .message(error.getDefaultMessage())
                    .field(FieldTranslator.translate(error.getField()))
                    .value(String.valueOf(error.getRejectedValue()))
                    .build();

            errorResponse.addField(field);
        });

        return errorResponse;
    }
}

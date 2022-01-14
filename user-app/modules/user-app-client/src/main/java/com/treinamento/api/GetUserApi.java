package com.treinamento.api;

import com.treinamento.model.getuser.RetrievedUserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface GetUserApi {

    @GetMapping("users")
    @ResponseStatus(HttpStatus.OK)
    List<RetrievedUserResponse> getAll();
}

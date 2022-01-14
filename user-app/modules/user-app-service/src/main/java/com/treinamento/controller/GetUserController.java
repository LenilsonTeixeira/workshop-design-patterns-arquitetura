package com.treinamento.controller;

import com.treinamento.api.GetUserApi;
import com.treinamento.controller.translator.RetrievedUserDomainToRetrievedUserResponse;
import com.treinamento.model.getuser.RetrievedUserResponse;
import com.treinamento.usecase.GetUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GetUserController implements GetUserApi {

    @Autowired
    private GetUserUseCase getUserUseCase;

    @Override
    public List<RetrievedUserResponse> getAll() {
        return getUserUseCase.execute().stream()
                .map(RetrievedUserDomainToRetrievedUserResponse::translate)
                .collect(Collectors.toList());
    }
}

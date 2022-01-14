package com.treinamento.controller;

import com.treinamento.adduser.AddUserDomain;
import com.treinamento.api.AddUserApi;
import com.treinamento.controller.translator.AddUserRequestToAddUserDomainTranslator;
import com.treinamento.controller.translator.AddedUserDomainToAddedUserResponseTranslator;
import com.treinamento.model.adduser.AddUserRequest;
import com.treinamento.model.adduser.AddedUserResponse;
import com.treinamento.usecase.AddUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AddUserController implements AddUserApi {

    @Autowired
    private AddUserUseCase addUserUseCase;

    @Override
    public AddedUserResponse add(@RequestBody @Valid AddUserRequest addUserRequest) {

        final AddUserDomain addUserDomain = AddUserRequestToAddUserDomainTranslator.translate(addUserRequest);

        return AddedUserDomainToAddedUserResponseTranslator.translate(addUserUseCase.execute(addUserDomain));
    }
}

package com.treinamento.controller;

import com.treinamento.api.UpdateUserApi;
import com.treinamento.controller.translator.UpdateUserRequestToUpdateUserDomainTranslator;
import com.treinamento.controller.translator.UpdatedUserDomainToUpdatedUserResponseTranslator;
import com.treinamento.model.updateuser.UpdateUserRequest;
import com.treinamento.model.updateuser.UpdatedUserResponse;
import com.treinamento.updateuser.UpdateUserDomain;
import com.treinamento.usecase.UpdateUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UpdateUserController implements UpdateUserApi {

    @Autowired
    private UpdateUserUseCase updateUserUseCase;

    @Override
    public UpdatedUserResponse update(@PathVariable("id") Long id, @RequestBody @Valid UpdateUserRequest updateUserRequest) {

        final UpdateUserDomain updateUserDomain = UpdateUserRequestToUpdateUserDomainTranslator.translate(updateUserRequest, id);

        return UpdatedUserDomainToUpdatedUserResponseTranslator.translate(updateUserUseCase.update(updateUserDomain));
    }
}

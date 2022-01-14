package com.treinamento.usecase;

import com.treinamento.exception.UserNotFoundException;
import com.treinamento.gateway.GetOneUserGateway;
import com.treinamento.getoneuser.ObtainedUserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetOneUserUseCase {

    @Autowired
    private GetOneUserGateway getOneUserGateway;

    public ObtainedUserDomain execute(final Long id) {
        return getOneUserGateway.getById(id)
                .orElseThrow(() -> new UserNotFoundException("Usuário não encontrado"));
    }
}

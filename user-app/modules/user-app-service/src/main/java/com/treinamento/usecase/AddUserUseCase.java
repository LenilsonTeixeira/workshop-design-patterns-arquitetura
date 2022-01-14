package com.treinamento.usecase;

import com.treinamento.adduser.AddUserDomain;
import com.treinamento.adduser.AddedUserDomain;
import com.treinamento.exception.AddUserException;
import com.treinamento.gateway.AddUserGateway;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Log4j2
@Component
public class AddUserUseCase {

    @Autowired
    private AddUserGateway addUserGateway;

    public AddedUserDomain execute(final AddUserDomain addUserDomain) {
        try {

            log.debug("Cadastrando usuário: {}", addUserDomain.getEmail());

            return addUserGateway.add(addUserDomain);

        } catch (final Exception e) {

            log.error(String.format("Falha ao salvar usuário.: %s", addUserDomain.getEmail(), e));

            throw new AddUserException("Ocorreu um erro ao salvar usuário");

        }
    }

}

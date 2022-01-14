package com.treinamento.gateway.database;

import com.treinamento.adduser.AddUserDomain;
import com.treinamento.adduser.AddedUserDomain;
import com.treinamento.gateway.AddUserGateway;
import com.treinamento.gateway.database.entity.UserEntity;
import com.treinamento.gateway.database.repository.UserRepository;
import com.treinamento.gateway.database.translator.AddUserDomainToUserEntityTranslator;
import com.treinamento.gateway.database.translator.UserEntityToAddedUserDomainTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddUserGatewayImpl implements AddUserGateway {

    @Autowired
    private UserRepository userRepository;

    @Override
    public AddedUserDomain add(final AddUserDomain addUserDomain) {

        final UserEntity userEntity = AddUserDomainToUserEntityTranslator.translate(addUserDomain);

        return UserEntityToAddedUserDomainTranslator.translate(userRepository.save(userEntity));
    }
}

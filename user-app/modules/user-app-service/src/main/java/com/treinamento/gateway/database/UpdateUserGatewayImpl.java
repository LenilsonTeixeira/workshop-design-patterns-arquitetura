package com.treinamento.gateway.database;

import com.treinamento.gateway.UpdateUserGateway;
import com.treinamento.gateway.database.entity.UserEntity;
import com.treinamento.gateway.database.repository.UserRepository;
import com.treinamento.gateway.database.translator.UpdateUserDomainToUserEntityTranslator;
import com.treinamento.gateway.database.translator.UserEntityToUpdatedUserDomainTranslator;
import com.treinamento.updateuser.UpdateUserDomain;
import com.treinamento.updateuser.UpdatedUserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserGatewayImpl implements UpdateUserGateway {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UpdatedUserDomain update(UpdateUserDomain updateUserDomain) {

        final UserEntity userEntity = UpdateUserDomainToUserEntityTranslator.translate(updateUserDomain);

        return UserEntityToUpdatedUserDomainTranslator.translate(userRepository.save(userEntity));
    }
}

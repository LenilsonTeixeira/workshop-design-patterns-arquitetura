package com.treinamento.gateway.database;

import com.treinamento.gateway.GetOneUserGateway;
import com.treinamento.gateway.database.repository.UserRepository;
import com.treinamento.gateway.database.translator.UserEntityToObtainedUserDomainTranslator;
import com.treinamento.getoneuser.ObtainedUserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetOneUserGatewayImpl implements GetOneUserGateway {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<ObtainedUserDomain> getById(final Long id) {
        return userRepository.findById(id)
                .map(UserEntityToObtainedUserDomainTranslator::translate);
    }
}

package com.treinamento.gateway.database;

import com.treinamento.gateway.GetUserGateway;
import com.treinamento.gateway.database.repository.UserRepository;
import com.treinamento.gateway.database.translator.UserEntityToRetrievedUserDomainTranslator;
import com.treinamento.getuser.RetrievedUserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GetUserGatewayImpl implements GetUserGateway {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<RetrievedUserDomain> getAll() {
        return userRepository.findAll().stream()
                .map(UserEntityToRetrievedUserDomainTranslator::translate)
                .collect(Collectors.toList());
    }
}

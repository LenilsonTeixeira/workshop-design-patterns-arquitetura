package com.treinamento.usecase;

import com.treinamento.gateway.GetUserGateway;
import com.treinamento.getuser.RetrievedUserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetUserUseCase {

    @Autowired
    private GetUserGateway getUserGateway;

    public List<RetrievedUserDomain> execute() {
        return getUserGateway.getAll();
    }
}

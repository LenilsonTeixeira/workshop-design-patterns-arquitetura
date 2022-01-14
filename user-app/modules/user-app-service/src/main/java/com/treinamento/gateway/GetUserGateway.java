package com.treinamento.gateway;

import com.treinamento.getuser.RetrievedUserDomain;

import java.util.List;

public interface GetUserGateway {

    List<RetrievedUserDomain> getAll();
}

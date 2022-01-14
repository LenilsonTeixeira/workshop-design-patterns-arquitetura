package com.treinamento.gateway;

import com.treinamento.getoneuser.ObtainedUserDomain;

import java.util.Optional;

public interface GetOneUserGateway {

    Optional<ObtainedUserDomain> getById(final Long id);
}

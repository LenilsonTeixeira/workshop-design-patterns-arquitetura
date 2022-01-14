package com.treinamento.gateway;

import com.treinamento.adduser.AddUserDomain;
import com.treinamento.adduser.AddedUserDomain;

public interface AddUserGateway {

    AddedUserDomain add(final AddUserDomain addUserDomain);
}

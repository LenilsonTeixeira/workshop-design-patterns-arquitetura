package com.treinamento.gateway;

import com.treinamento.updateuser.UpdateUserDomain;
import com.treinamento.updateuser.UpdatedUserDomain;

public interface UpdateUserGateway {

    UpdatedUserDomain update(final UpdateUserDomain updateUserDomain);
}

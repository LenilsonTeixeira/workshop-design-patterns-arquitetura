package com.treinamento.usecase;

import com.treinamento.gateway.UpdateUserGateway;
import com.treinamento.getoneuser.ObtainedUserDomain;
import com.treinamento.updateuser.UpdateUserDomain;
import com.treinamento.updateuser.UpdatedUserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserUseCase {

    @Autowired
    private GetOneUserUseCase getOneUserUseCase;

    @Autowired
    private UpdateUserGateway updateUserGateway;

    public UpdatedUserDomain update(final UpdateUserDomain updateUserDomain) {

        final ObtainedUserDomain obtainedUserDomain = getOneUserUseCase.execute(updateUserDomain.getId());

        updateUserDomain.setId(obtainedUserDomain.getId());

        return updateUserGateway.update(updateUserDomain);

    }
}

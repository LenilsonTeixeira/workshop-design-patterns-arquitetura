package com.treinamento.controller.translator;

import com.treinamento.model.updateuser.UpdateUserRequest;
import com.treinamento.updateuser.UpdateUserDomain;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class UpdateUserRequestToUpdateUserDomainTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static UpdateUserDomain translate(final UpdateUserRequest updateUserRequest, final Long id) {

        final UpdateUserDomain updateUserDomain = MAPPER.map(updateUserRequest, UpdateUserDomain.class);

        updateUserDomain.setId(id);

        return updateUserDomain;
    }
}

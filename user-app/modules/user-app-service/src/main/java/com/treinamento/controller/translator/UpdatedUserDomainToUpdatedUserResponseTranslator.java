package com.treinamento.controller.translator;

import com.treinamento.model.updateuser.UpdatedUserResponse;
import com.treinamento.updateuser.UpdatedUserDomain;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class UpdatedUserDomainToUpdatedUserResponseTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static UpdatedUserResponse translate(final UpdatedUserDomain updatedUserDomain) {
        return MAPPER.map(updatedUserDomain, UpdatedUserResponse.class);
    }
}

package com.treinamento.gateway.database.translator;

import com.treinamento.gateway.database.entity.UserEntity;
import com.treinamento.updateuser.UpdateUserDomain;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class UpdateUserDomainToUserEntityTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static UserEntity translate(final UpdateUserDomain updateUserDomain) {
        return MAPPER.map(updateUserDomain, UserEntity.class);
    }
}

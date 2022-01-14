package com.treinamento.gateway.database.translator;

import com.treinamento.gateway.database.entity.UserEntity;
import com.treinamento.updateuser.UpdatedUserDomain;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class UserEntityToUpdatedUserDomainTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static UpdatedUserDomain translate(final UserEntity userEntity) {
        return MAPPER.map(userEntity, UpdatedUserDomain.class);
    }
}

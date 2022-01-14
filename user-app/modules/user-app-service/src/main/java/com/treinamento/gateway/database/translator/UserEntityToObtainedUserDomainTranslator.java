package com.treinamento.gateway.database.translator;

import com.treinamento.gateway.database.entity.UserEntity;
import com.treinamento.getoneuser.ObtainedUserDomain;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class UserEntityToObtainedUserDomainTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static ObtainedUserDomain translate(final UserEntity userEntity) {
        return MAPPER.map(userEntity, ObtainedUserDomain.class);
    }
}

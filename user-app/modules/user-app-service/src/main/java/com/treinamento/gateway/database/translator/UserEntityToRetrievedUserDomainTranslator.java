package com.treinamento.gateway.database.translator;

import com.treinamento.gateway.database.entity.UserEntity;
import com.treinamento.getuser.RetrievedUserDomain;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class UserEntityToRetrievedUserDomainTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static RetrievedUserDomain translate(final UserEntity userEntity) {
        return MAPPER.map(userEntity, RetrievedUserDomain.class);
    }
}

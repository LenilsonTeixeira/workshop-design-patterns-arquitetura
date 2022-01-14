package com.treinamento.gateway.database.translator;

import com.treinamento.adduser.AddedUserDomain;
import com.treinamento.gateway.database.entity.UserEntity;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class UserEntityToAddedUserDomainTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static AddedUserDomain translate(final UserEntity userEntity) {
        return MAPPER.map(userEntity, AddedUserDomain.class);
    }
}

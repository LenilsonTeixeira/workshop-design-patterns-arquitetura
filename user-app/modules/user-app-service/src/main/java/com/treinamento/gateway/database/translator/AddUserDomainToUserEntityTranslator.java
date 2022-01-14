package com.treinamento.gateway.database.translator;

import com.treinamento.adduser.AddUserDomain;
import com.treinamento.gateway.database.entity.UserEntity;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class AddUserDomainToUserEntityTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static UserEntity translate(final AddUserDomain addUserDomain) {
        return UserEntity.builder()
                .name(addUserDomain.getName())
                .email(addUserDomain.getEmail())
                .age(addUserDomain.getAge())
                .build();
    }
}

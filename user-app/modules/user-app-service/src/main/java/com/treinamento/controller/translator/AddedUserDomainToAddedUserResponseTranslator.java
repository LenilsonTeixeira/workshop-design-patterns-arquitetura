package com.treinamento.controller.translator;

import com.treinamento.adduser.AddedUserDomain;
import com.treinamento.model.adduser.AddedUserResponse;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class AddedUserDomainToAddedUserResponseTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static AddedUserResponse translate(final AddedUserDomain addedUserDomain) {
        return MAPPER.map(addedUserDomain, AddedUserResponse.class);
    }
}

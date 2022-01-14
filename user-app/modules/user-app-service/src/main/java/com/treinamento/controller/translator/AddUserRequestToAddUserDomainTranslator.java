package com.treinamento.controller.translator;

import com.treinamento.adduser.AddUserDomain;
import com.treinamento.model.adduser.AddUserRequest;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class AddUserRequestToAddUserDomainTranslator {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static AddUserDomain translate(final AddUserRequest addUserRequest) {
        return MAPPER.map(addUserRequest, AddUserDomain.class);
    }
}

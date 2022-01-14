package com.treinamento.controller.translator;

import com.treinamento.getuser.RetrievedUserDomain;
import com.treinamento.model.getuser.RetrievedUserResponse;
import lombok.experimental.UtilityClass;
import org.modelmapper.ModelMapper;

@UtilityClass
public class RetrievedUserDomainToRetrievedUserResponse {

    private static final ModelMapper MAPPER = new ModelMapper();

    public static RetrievedUserResponse translate(final RetrievedUserDomain retrievedUserDomain) {
        return MAPPER.map(retrievedUserDomain, RetrievedUserResponse.class);
    }
}

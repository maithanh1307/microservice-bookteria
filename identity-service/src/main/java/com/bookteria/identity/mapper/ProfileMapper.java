package com.bookteria.identity.mapper;

import org.mapstruct.Mapper;

import com.bookteria.identity.dto.request.ProfileCreationRequest;
import com.bookteria.identity.dto.request.UserCreationRequest;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}

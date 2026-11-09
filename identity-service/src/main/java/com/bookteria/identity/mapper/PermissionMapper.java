package com.bookteria.identity.mapper;

import org.mapstruct.Mapper;

import com.bookteria.identity.dto.request.PermissionRequest;
import com.bookteria.identity.dto.response.PermissionResponse;
import com.bookteria.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}

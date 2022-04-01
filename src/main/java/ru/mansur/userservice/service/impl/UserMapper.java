package ru.mansur.userservice.service.impl;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.mansur.userservice.model.User;
import ru.mansur.userservice.model.dto.UserDto;

@Mapper
public interface UserMapper {

    @Mapping(target = "id", source = "user.id")
    @Mapping(target = "name", source = "user.name")
    @Mapping(target = "roleName", source = "user.role.roleName")
    UserDto toDto(User user);
}

package com.learning.spr.mapper;

import com.learning.spr.dto.request.UserCreation;
import com.learning.spr.dto.request.UserUpdate;
import com.learning.spr.dto.response.UserResponse;
import com.learning.spr.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreation request);
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdate request);
}

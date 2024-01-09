package com.kumarmudur.springboot.mapper;

import com.kumarmudur.springboot.dto.UserDto;
import com.kumarmudur.springboot.entity.User;

public class UserMapper {

    // Convert User JPA Entity into UserDto
    public static UserDto mapToUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
    }

    // Convert UserDto into User JPA Entity
    public static User mapToUser(UserDto user) {
        return new User(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
    }
}

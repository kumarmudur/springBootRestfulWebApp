package com.kumarmudur.springboot.service;

import com.kumarmudur.springboot.dto.UserDto;
import com.kumarmudur.springboot.entity.User;

import java.util.List;

public interface UserService {
    //User createUser(User user);

    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}


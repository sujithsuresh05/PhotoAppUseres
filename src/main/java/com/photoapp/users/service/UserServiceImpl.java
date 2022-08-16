package com.photoapp.users.service;

import com.photoapp.users.dto.UserDto;

import java.util.UUID;

public class UserServiceImpl implements UserService{

    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }
}

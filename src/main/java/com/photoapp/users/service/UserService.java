package com.photoapp.users.service;

import com.photoapp.users.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public UserDto createUser(UserDto userDetails);

}

package com.example.codingevents.service;

import com.example.codingevents.models.RegistrationRequest;
import com.example.codingevents.models.User;
import com.example.codingevents.models.dto.UserDto;

import java.util.List;

public interface UserService {

    boolean checkEmail(String email);

    UserDto registerUser(RegistrationRequest registrationRequest);

    UserDto getLoginUser();

    UserDto getUserById(Integer id);

    List<UserDto> getAllUsers();

    UserDto createUser(User user);

    UserDto updateUser(User user);

    void deleteUser(User user);
}

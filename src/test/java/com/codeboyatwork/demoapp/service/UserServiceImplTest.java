package com.codeboyatwork.demoapp.service;

import com.codeboyatwork.demoapp.entity.User;
import com.codeboyatwork.demoapp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(SpringExtension.class)
class UserServiceImplTest {
    @Autowired
    private UserService  userService;
    @MockBean
    private UserRepository userRepository;

    private final List<User> users = new ArrayList<>();

    @Test
    void getAllUsers(){
        Mockito.when(userRepository.findAll()).thenReturn(users);
        List<User> userList =  userService.getAllUsers();
        Assertions.assertEquals(users,userList);
    }
}

package com.example.crud.restful.resource;

import java.util.List;

import com.example.crud.restful.model.param.UserInputParam;
import com.example.crud.model.User;
import com.example.crud.service.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 유저 CRUD
 * 01. 유저 리스트 조회 (method: get, path: /users)
 * 02. 유저 상세 조회 (method: get, path: /users/{id})
 * 03. 유저 생성 (method: post, path: /users)	
 * 04. 유저 정보 수정 (method: put, path: /users/{id})
 * 05. 유저 삭제 (method: delete, path: /users/{id})
*/

@RestController("CRUDRestFul")
@RequestMapping(value = "/api/v1")

public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 01. 유저 리스트 조회
    */
    @RequestMapping(path = "/users", method = RequestMethod.GET, consumes = "application/json")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * 02. 유저 상세 조회
    */
    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET, consumes = "application/json")
    public User getUserByUserId(@PathVariable String userId) {
       return userService.getUserByUserId(userId);
    }

    /**
     * 03. 유저 가입
    */
    @RequestMapping(path = "/users", method = RequestMethod.POST, consumes = "application/json")
    public String registerUser(@RequestBody UserInputParam userInputParam) {
        return userService.registerUser(userInputParam);
    }

    /**
     * 04. 유저 정보 수정
    */
    @RequestMapping(path = "/users/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public void updatePost(@PathVariable String id, @RequestBody UserInputParam userInputParam) {
        userService.updateUser(id, userInputParam);

        return;
    }

    /**
     * 05. 유저 삭제
    */
    @RequestMapping(path = "/users/{id}", method = RequestMethod.DELETE, consumes = "application/json")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
        return ;
    }
}

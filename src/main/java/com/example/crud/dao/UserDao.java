package com.example.crud.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.crud.model.User;
import com.example.crud.restful.model.param.UserInputParam;

import org.springframework.stereotype.Repository;

/**
 * role of object for access of DB
 */
@Repository
public class UserDao {
    public static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("1", "username1", "username1@email.com"));
        users.add(new User("2", "username2", "username2@email.com"));
        users.add(new User("3", "username3", "username3@email.com"));
        users.add(new User("4", "username4", "username4@email.com"));
    }

    
    public List<User> getAllUsers() {
        return users;
    }

    /**
	 * 유저 상세 정보 조회
     * @param userId 글 id
	 * @return 유저 상세정보
	 */
    public User getUserByUserId(String userId) {
        return users
        .stream()
        .filter(user -> user.getUserId().equals(userId))
        .findAny()
        .orElse(new User("", "", ""));
    }

    /**
	 * 유저 가입
     * @param UserInputParam
	 * @return 유저 id
	 */
    public String createUser(UserInputParam userInputParam) {
        String userId = Integer.toString(users.size() + 1);
        users.add(new User(userId, userInputParam.getUserEmail(), userInputParam.getUserName()));

        return userId;
    }

    /**
	 * 유저 정보 수정
     * @param userId 유저 id
	 * @param UserInputParam
	 * @return
	 */
    public void updateUser(String userId, UserInputParam userInputParam) {
        users
        .stream()
        .filter(currentUser -> currentUser.getUserId().equals(userId))
        .findAny()
        .orElse(new User("", "", ""))
        .setUser(userInputParam.getUserEmail(), userInputParam.getUserName());

        return;
    }

    /**
	 * 유저 삭제
     * @param userId 유저 id
	 * @return
	 */
    public void deleteUser(String userId) {
        users.removeIf(user -> user.getUserId().equals(userId));

        return;
    }
}

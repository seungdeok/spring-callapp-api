package com.example.crud.service;

import java.util.List;

import com.example.crud.dao.UserDao;

import com.example.crud.model.User;
import com.example.crud.restful.model.param.UserInputParam;
import com.example.crud.model.ReturnData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * role requested from method of UserDao
 */
@Service
public class UserService {
	@Autowired
	UserDao userDao;

    /**
	 * 유저 리스트 조회
	 * @return 글 목록
	 */
    public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

    /**
	 * 유저 상세 정보 조회
     * @param userId 글 id
	 * @return 유저 상세정보
	 */
    public User getUserByUserId(String userId) {
		return userDao.getUserByUserId(userId);
	}

	/**
	 * 유저 가입
     * @param UserInputParam
	 * @return 유저 id
	 */
    public String registerUser(UserInputParam userInputParam) {
		return userDao.createUser(userInputParam);
	}

    /**
	 * 유저 정보 수정
     * @param userId 유저 id
	 * @param UserInputParam
	 * @return
	 */
    public void updateUser(String userId, UserInputParam userInputParam) {
		userDao.updateUser(userId, userInputParam);
		return;
	}

    /**
	 * 유저 삭제
     * @param userId 유저 id
	 * @return
	 */
    public void deleteUser(String userId) {
		userDao.deleteUser(userId);
		return;
	}
}

package com.example.crud.model;

public class User {
    private String userId;
    private String userName;
    private String userEmail;

    public User() {}

    public User(String userId, String userName, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    /**
	 * @return the userId
	 */
    public String getUserId() {
        return userId;
    }

    /**
	 * @param userId the userId to set
	 */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
	 * @return the userName
	 */
    public String getUserName() {
        return userName;
    }

    /**
	 * @param userName the userName to set
	 */
    void setUserName(String userName) {
        this.userName = userName;
    }

    /**
	 * @return the userEmail
	 */    
    public String getUserEmail() {
        return userEmail;
    }

    /**
	 * @param userEmail the userEmail to set
	 */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;        
    }

    /**
	 * @param userEmail the userEmail to set
     * @param userName the userName to set
	 */
    public void setUser(String userEmail, String userName) {
        this.userEmail = userEmail;   
        this.userName = userName;     
    }
}

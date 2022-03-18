package com.example.crud.restful.model.param;

public class UserInputParam {
    private String userName;
    private String userEmail;

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
}

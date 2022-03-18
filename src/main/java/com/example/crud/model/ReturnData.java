package com.example.crud.model;

public class ReturnData {
    private Boolean success;
    private String errorMessage;
    
    /**
	 * @return the success
	 */
    public Boolean getSuccess() {
        return success;
    }

    /**
	 * @param success the success to set
	 */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
	 * @return the error message
	 */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
	 * @param errorMessage the errorMessage to set
	 */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}


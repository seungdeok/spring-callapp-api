package com.example.crud.model;

public class Head {
    public int returnCode = 0;
	public String returnDesc = "";
	private int affected;

    /**
	 * @return the returnCode
	 */
    public int getReturnCode() {
        return returnCode;
    }

    /**
	 * @param returnCode the returnCode to set
	 */
    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }
    
    /**
	 * @return the returnDesc
	 */
    public String getReturnDesc() {
        return returnDesc;
    }

    /**
	 * @param returnDesc the returnDesc to set
	 */
    public void setReturnDesc(String returnDesc) {
        this.returnDesc = returnDesc;
    }

    /**
	 * @return the affected
	 */
    public int getAffected() {
        return affected;
    }

    /**
	 * @param affected the affected to set
	 */
    public void setAffected(int affected) {
        this.affected = affected;
    }   
}

package com.example.crud.model.post;

public class PostReturnData {
    private String title;
    private float createDate;
    private float updateDate;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCreateDate() {
        return createDate;
    }

    public void setCreateDate(float createDate) {
        this.createDate = createDate;
    }

    public float getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(float updateDate) {
        this.updateDate = updateDate;
    }   
}
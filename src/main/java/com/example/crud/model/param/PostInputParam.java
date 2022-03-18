package com.example.crud.model.param;

public class PostInputParam {
    private String itemId;
    private String title;
    private float createDate;
    private float updateDate;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
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

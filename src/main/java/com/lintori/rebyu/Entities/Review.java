package com.lintori.rebyu.Entities;

import com.lintori.rebyu.Generic.Date;

public class Review {

    private Long id;
    private Long itemId;
    private String userId;
    private Float rating;
    private String description;
    private Date createdAt;


    public Review(Long id, Long itemId, String userId, Float rating, String description, Date createdAt) {
        this.id = id;
        this.itemId = itemId;
        this.userId = userId;
        this.rating = rating;
        this.description = description;
        this.createdAt = createdAt;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getItemId() {
        return itemId;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Float getRating() {
        return rating;
    }
    public void setRating(Float rating) {
        this.rating = rating;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    

    
}

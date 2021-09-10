package com.lintori.rebyu.Entities;

import com.lintori.rebyu.Generic.Date;

public class Item {

    private Long id;
    private String image;
    private String title;
    private Integer nReviews;
    private Float Rating;
    private String description;
    private Date createdAt;
    private Date updatedAt;
    private User addedBy;

    public Item(Long id, String image, String title, Integer nReviews, Float rating, String description, Date createdAt,
            Date updatedAt, User addedBy) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.nReviews = nReviews;
        Rating = rating;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.addedBy = addedBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getnReviews() {
        return nReviews;
    }

    public void setnReviews(Integer nReviews) {
        this.nReviews = nReviews;
    }

    public Float getRating() {
        return Rating;
    }

    public void setRating(Float rating) {
        Rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean equals(Object compared){
        boolean output = false;
        if (this == compared){
            output = true;
        }
        if (!(compared instanceof Item)){
            output = false;
        }
        Item comparedItem = (Item) compared;
        if (this.id == comparedItem.getId() &&
                this.title.equals(comparedItem.getTitle()) &&
                this.addedBy.equals(comparedItem.getAddedBy()) &&
                this.createdAt.equals(comparedItem.getCreatedAt()) &&
                this.updatedAt.equals(comparedItem.getUpdatedAt())
        ){
            output = true;
        }
        return output;
    }

}



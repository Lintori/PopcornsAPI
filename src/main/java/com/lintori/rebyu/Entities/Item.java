package com.lintori.rebyu.Entities;

import com.lintori.rebyu.Generic.Date;

import javax.persistence.*;


@Entity(name="users")
@Table(
    name = "users"
)
public class Item {

    @Id
    @GeneratedValue(
        generator = "user_generator",
        strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
        name = "user_generator",
        sequenceName = "user_sequence",
        allocationSize = 1
    )
    @Column(
        name = "id",
        updatable = false,
        nullable = false
    )
    private Long id;

    @Column(
        name = "image",
        nullable = false,
        columnDefinition = "CHARACTER VARYING (50)"
    )
    private String image;

    @Column(
        name = "image",
        nullable = false,
        columnDefinition = "CHARACTER VARYING (50)"
    )
    private String title;

    @Column(
        name = "nReviews",
        nullable = false,
        columnDefinition = "BIGINT"
    )
    private Integer nReviews;

    @Column(
        name = "Rating",
        nullable = false,
        columnDefinition = "DOUBLE PRECISION"
    )
    private Float Rating;

    @Column(
        name = "description",
        nullable = false,
        columnDefinition = "CHARACTER VARYING (50)"
    )
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
        this.Rating = rating;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.addedBy = addedBy;
    }

    

    public Item() {
        this.id = null;
        this.image = "";
        this.title = "";
        this.nReviews = null;
        this.Rating = null;
        this.description = "";
        this.createdAt = null;
        this.updatedAt = null;
        this.addedBy = null;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return this.image;
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
        return this.Rating;
    }

    public void setRating(Float rating) {
        this.Rating = rating;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAddedBy() {
        return this.addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
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



package com.lintori.rebyu.Entities;

import com.lintori.rebyu.Generic.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "users")
public class User {

    @Id
    private String id;
    @Field
    private String username;
    @Field
    private String name;
    @Field
    private String lastname;
    @Field
    private String profilePicture;
    @Field
    private String email;
    private Date dateCreation;
    private Integer nReviews;

    public User(String id, String username, String name, String lastname, String profilePicture, String email,
            Date dateCreation, Integer nReviews) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.profilePicture = profilePicture;
        this.email = email;
        this.dateCreation = dateCreation;
        this.nReviews = nReviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }    

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Integer getnReviews() {
        return nReviews;
    }

    public void setnReviews(Integer nReviews) {
        this.nReviews = nReviews;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Object compared){
        boolean output = false;
        if (this == compared){
            output = true;
        }
        if (!(compared instanceof User)){
            output = false;
        }
        User comparedUser = (User) compared;
        if (this.id == comparedUser.getId() &&
                this.username.equals(comparedUser.getUsername()) &&
                this.name.equals(comparedUser.getName()) &&
                this.lastname.equals(comparedUser.getLastname()) &&
                this.profilePicture.equals(comparedUser.getProfilePicture()) &&
                this.email.equals(comparedUser.getEmail())
        ){
            output = true;
        }
        return output;
    }
}

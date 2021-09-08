package com.lintori.rebyu.Entities;

//import java.util.List;

public class User {

    private int id;
    private String username;
    private String name;
    private String lastname;
    private String profilePicture;
    private String email;
    // Is this being used?
    //private List<Item> items;

    public User(Integer id, String username, String name, String lastname, String profilePicture, String email) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.profilePicture = profilePicture;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

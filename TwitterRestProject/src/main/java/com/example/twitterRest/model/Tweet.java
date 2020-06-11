package com.example.twitterRest.model;

import javax.persistence.*;

@Entity
@Table(name="tweets")
public class Tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="user_name")
    private  String username;
    @Column(name="user_handle")
    private String userHandle;
    @Column(name="user_image_url")
    private String userImageUrl;
    @Column(name="message")
    private String message;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserHandle() {
        return userHandle;
    }

    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "Tweet{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userHandle='" + userHandle + '\'' +
                ", userImageUrl='" + userImageUrl + '\'' +
                ", message='" + message + '\'' +
                '}';
    }


}

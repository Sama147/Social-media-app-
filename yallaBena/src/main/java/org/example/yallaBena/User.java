package org.example.yallaBena;

import javafx.scene.image.Image;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String username;
    private String password;
    private String bio;
    private String profilePicture;
    private List<User> friendList;


    public User() {
        this.friendList = new ArrayList<>();
    }

    public User(String username, String password, String bio, String profilePicture, String id) {
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.profilePicture = profilePicture;
        this.friendList = new ArrayList<>();
        this.userId = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public List<User> getFriendList() {
        return friendList;
    }

    public void addFriend(User friend) {
        friendList.add(friend);
    }

    public void removeFriend(User friend) {
        friendList.remove(friend);
    }

    public String getId() {
        return userId;
    }

        @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }

}


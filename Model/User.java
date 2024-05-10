package Model;

import java.util.ArrayList;
import java.util.List;

public class User
{
    private String username;
    private String bio;
    private String profilePicture;
    private final List<User> friendList;
    private ArrayList<Post> posts;
    private ArrayList<Comment> comments;
    //private ArrayList<Post> likes;

    public User()
    {
        this.friendList = new ArrayList<>();
    }

    public User(String username, String bio, String profilePicture)
    {
        this.username = username;
        this.bio = bio;
        this.profilePicture = profilePicture;
        this.friendList = new ArrayList<>();
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setBio(String bio)
    {
        this.bio = bio;
    }

    public void setProfilePicture(String profilePicture)
    {
        this.profilePicture = profilePicture;
    }


    public String getProfilePicture()
    {
        return profilePicture;
    }

    public String getUsername()
    {
        return username;
    }
    public Object getPassword()
    {
        Object Password;
        return null;
    }

    public String getBio()
    {
        return bio;
    }


    public ArrayList<Post> getPosts()
    {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts)
    {
        this.posts = posts;

    }

    public ArrayList<Comment> getComments()
    {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments)
    {
        this.comments = comments;
    }


    /*public  ArrayList<Post> getLikes()
    {
        return Likes;
    }
    public void setLikes (ArrayList<Post> likes)
    {
        this.likes = likes;
    }

     */

    public List<User> getFriendList() {
        return friendList;
    }

    public void addFriend(User friend) {
        friendList.add(friend);
    }

    public void removeFriend(User friend) {
        friendList.remove(friend);
    }

}

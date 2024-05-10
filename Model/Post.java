package Model;

import java.util.ArrayList;

public class Post
{
    private String content;
    private User user;
    private ArrayList<Comment> comments;
    private ArrayList<User> likes;

    public Post() {}

    public String getContent()
    {
        return content;
    }

    public void setConent(String content)
    {
        this.content = content;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public ArrayList<Comment> getComments()
    {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments)
    {
        this.comments = comments;
    }

    public void setLikes(ArrayList<User> likes)
    {
        this.likes = likes;
    }

}

package Model;

public class Comment
{
    private String content;
    private User user;
    private Post post;

    public Comment() {}

    public String getContent()
    {
        return  content;
    }

    public void setContent(String content)
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
}

package org.example.yallaBena;



import java.awt.desktop.UserSessionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Post {
    private String content;
    private User author;
    private List<Comments> comments;
    private List<Likes> likes;

    public Post() {
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
    }

    public Post(String content, User author) {
        this.content = content;
        this.author = author;
        this.comments = new ArrayList<>();
        this.likes = new ArrayList<>();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void addComment(Comments comment) {
        comments.add(comment);
    }

    public void removeComment(Comments comment) {
        comments.remove(comment);
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void addLike(Likes like) {
        likes.add(like);
    }

    public void removeLike(Likes like) {
        likes.remove(like);
    }

    public List<Likes> getLikes() {
        return likes;
    }

    public void createPost(){
        Post p1 = new Post();
        p1.setContent(content);

        //login code
        /*List<User> users = UserManager.getUsers();
        for (User u : users) {
            if (u.getUsername() == un)
                p1.setAuthor(u);
        }*/

        System.out.println("The post is successfully created") ;
        p1.printPost();
        System.out.println("==================================") ;
    }

    public void printPost() {
        System.out.println("==================================") ;
        System.out.println("Post content is "  + this.getContent()) ;
        System.out.println("Post's author is "  + this.getAuthor()) ;
        System.out.println("==================================") ;
    }
}

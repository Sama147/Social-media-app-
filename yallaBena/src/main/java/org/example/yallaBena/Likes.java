package org.example.yallaBena;

public class Likes {
    private User user;
    private Post post;

    public void Like(User user, Post post) {
        this.user = user;
        this.post = post;
    }

    public void setUser(User user) {
        this.user= user;
    }

    public User getUser() {
        return user;
    }

    public void setPost(Post post) {
        this.post= post;
    }

    public Post getPost() {
        return post;
    }
}

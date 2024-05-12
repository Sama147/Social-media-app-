package org.example.yallaBena;

import java.util.ArrayList;
import java.util.List;

public class PostManager {

    private static List<Post> posts;

    public PostManager() {
        this.posts = new ArrayList<>();
    }

    public void createPost(Post post) {
        posts.add(post);
    }

    public List<Post> getPosts() {
        return posts;
    }

    public static void add(Post p){
        posts.add(p);
    }

    //remove
}
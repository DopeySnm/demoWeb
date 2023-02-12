package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<>(3);
        Post post1 = new Post("Пост 1");
        Post post2 = new Post("Пост 2");
        Post post3 = new Post("Пост 3");
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        return posts;
    }
}

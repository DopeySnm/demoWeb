package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    private ArrayList<Post> posts;
    PostService(){
        posts = new ArrayList<>();
        Post post1 = new Post(0L,"Пост 1", new Date());
        posts.add(post1);
    }

    public ArrayList<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) (posts.size() + 1), text, new Date()));
    }
}

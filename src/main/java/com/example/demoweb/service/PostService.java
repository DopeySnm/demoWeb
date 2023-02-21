package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public Post getById(Long id){
        return postRepository.findById(id).get();
    }

    public List<Post> listAllPosts() {
        return (List<Post>) postRepository.findAll();
    }

    public void create(String text) {
        Random random = new Random();
        Long id = random.nextLong(1,1000);
        while (postRepository.existsById(id)){
            id = random.nextLong(1,1000);
        }
        Post post = new Post(id, text, new Date());
        postRepository.save(post);
    }
}

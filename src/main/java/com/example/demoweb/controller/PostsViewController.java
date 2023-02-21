package com.example.demoweb.controller;

import com.example.demoweb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostsViewController {

    @Autowired
    private PostService postsService;
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String list(Model model) {
//        List<Post> arr = postsService.listAllPosts();
//        StringBuilder data = new StringBuilder();
//        for (Post i: arr) {
//            data.append(i.getText() + " - " + i.getLikes() + " ");
//        }
        model.addAttribute("appName", "Мой сайт, сам мой");
        model.addAttribute("posts", postsService.listAllPosts());
        return "list";
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста №" + id;
    }
}

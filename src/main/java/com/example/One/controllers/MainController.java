package com.example.One.controllers;

import com.example.One.models.Post;
import com.example.One.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/")
    public String home(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts",posts);
        model.addAttribute("title", "Main");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }




}
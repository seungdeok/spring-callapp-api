package com.example.crud;

import java.util.List;

import com.example.crud.model.param.PostInputParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController("postRestFul")
@RequestMapping(value = "api/post")

public class PostController {
    
    @RequestMapping(path = "/posts", method = RequestMethod.GET, consumes = "application/json")
    public void getPostList() {
        // return [];
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET, consumes = "application/json")
    public void getPost(@PathVariable Long id) {
    //    return 
    }

    @RequestMapping(path = "/posts", method = RequestMethod.POST, consumes = "application/json")
    public void createPost(@RequestBody PostInputParam postInputParam) {
    //    return 
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.PUT, consumes = "application/json")
    public void updatePost(@PathVariable Long id) {
    //    return 
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.DELETE, consumes = "application/json")
    public void deletePost(@PathVariable Long id) {
    //    return 
    }
}

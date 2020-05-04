package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostServiceImpl;
import com.greenfoxacademy.reddit.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

  private final PostServiceImpl postService;
  private final UserServiceImpl userService;

  @Autowired
  public PostController(PostServiceImpl postService, UserServiceImpl userService) {
    this.postService = postService;
    this.userService = userService;
  }
}

package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.models.Posts;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.services.PostServiceImpl;
import com.greenfoxacademy.redditapp.services.UserServiceImpl;
import java.awt.Stroke;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private PostServiceImpl postService;
  private UserServiceImpl userService;

  @Autowired
  public MainController(PostServiceImpl postService, UserServiceImpl userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping("reddit")
  public String listPosts(Model model, String name) {
    model.addAttribute("name", name);
    model.addAttribute("posts", postService.sortPostsByVote());
    model.addAttribute("currentUser", userService.findByName(name));
    return "index";
  }

  @GetMapping("reddit/submit")
  public String submitPage(Model model, @RequestParam String name) {
    model.addAttribute("newPosts", new Posts());
    model.addAttribute("name", name);
    return "submit";
  }

  @GetMapping("reddit/submit")
  public String submitPost(@RequestParam String title, @RequestParam String url,
      @RequestParam String user, Model model) {
    Posts posts = new Posts(title, url);
    User u = userService.findByName(user);
    if (u != null) {
      posts.setUser(u);
    } else {

    }
    postService.addPosts(posts);
    return "redirect:/reddit";
  }

  @GetMapping("reddit/login")
  public String vote(@RequestParam String vote, @RequestParam long id) {
    postService.countVotes(vote, id);
    return "redirect:/reddit";
  }
  @GetMapping("reddit/login")
  public String getLoginPage() {
    return "login";
  }

  public String userLogin(@RequestParam String name) {
    return "redirect:/reddit/?name=" + name;
  }
}

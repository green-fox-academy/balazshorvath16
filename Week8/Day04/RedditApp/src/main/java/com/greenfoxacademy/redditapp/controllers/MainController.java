package com.greenfoxacademy.redditapp.controllers;

import com.greenfoxacademy.redditapp.models.Posts;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.services.PostServiceImpl;
import com.greenfoxacademy.redditapp.services.PostsService;
import com.greenfoxacademy.redditapp.services.UserService;
import com.greenfoxacademy.redditapp.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

  @GetMapping("/reddit")
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

  @PostMapping("reddit/submit")
  public String submitPost(@RequestParam String title, @RequestParam String url,
      @RequestParam String user, Model model) {
    Posts posts = new Posts(title, url);
    User u = userService.findByName(user);
    if (u != null) {
      posts.setUser(u);
    }

    postService.addPosts(posts);
    return "redirect:/reddit";
  }

  @GetMapping("reddit/vote")
  public String vote(@RequestParam String vote, @RequestParam long id) {
    postService.countVotes(vote, id);
    return "redirect:/reddit";
  }
  @GetMapping("reddit/login")
  public String getLoginPage() {
    return "login";
  }

  @PostMapping("reddit/login")
public String userLogin(@RequestParam String name) {
    return "redirect:/reddit/?name=" + name;
  }
}

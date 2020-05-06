package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Posts;
import com.greenfoxacademy.redditapp.models.User;
import java.util.List;
import org.springframework.stereotype.Service;


public interface UserService {
  Iterable<Posts> getPostsForOneUser();
  User findById(long id);
  User findByName(String name);
  List<User> returnAllUsers();
  void addPostsToUser(Posts post, User user);

}

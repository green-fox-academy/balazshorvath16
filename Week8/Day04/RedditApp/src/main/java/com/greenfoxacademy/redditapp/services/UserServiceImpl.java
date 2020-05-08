package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Posts;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Iterable<Posts> getPostsForOneUser() {
    return null;
  }

  @Override
  public User findById(long id) {
   if (userRepository.findById(id).isPresent()) {
     User user = userRepository.findById(id).get();
     return user;
   }
   return null;
  }

  @Override
  public User findByName(String name) {
    return userRepository.getByUserName(name);
  }

  @Override
  public List<User> returnAllUsers() {
    List<User> users = new ArrayList<>();
    userRepository.findAll().forEach(users::add);
    return users;
  }

  @Override
  public void addPostsToUser(Posts post, User user) {
    List<Posts> postsList = user.getPosts();
    postsList.add(post);
    user.setPosts(postsList);
     userRepository.save(user);
  }
}

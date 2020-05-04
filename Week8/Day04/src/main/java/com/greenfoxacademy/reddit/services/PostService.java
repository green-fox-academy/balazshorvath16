package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

  void addPost(Post post);

  List<Post> getPosts();

  Post findById(long id);

  void votePost(long id, boolean ifVoted);

  void addUserToPost(User user, Post post);

}

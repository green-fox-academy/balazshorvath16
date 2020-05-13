package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Posts;
import java.util.List;
import javafx.geometry.Pos;
import org.springframework.stereotype.Service;


public interface PostsService {

  void addPosts(Posts posts);
  Posts findById(Long id);
  Iterable<Posts> getPosts();
  void countVotes(String vote, long id);
  List<Posts> sortPostsByVote();
  void addUserToPosts(Long userId, Long postsId);
}

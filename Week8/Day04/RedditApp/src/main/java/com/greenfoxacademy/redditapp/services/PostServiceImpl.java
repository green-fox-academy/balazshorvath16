package com.greenfoxacademy.redditapp.services;

import com.greenfoxacademy.redditapp.models.Posts;
import com.greenfoxacademy.redditapp.models.User;
import com.greenfoxacademy.redditapp.repository.PostRepository;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;
import org.graalvm.compiler.nodes.calc.IntegerDivRemNode.Op;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostsService {

PostRepository postRepository;
UserService userService;

  @Autowired
  public PostServiceImpl(PostRepository postRepository, UserService userService) {
    this.postRepository = postRepository;
    this.userService = userService;
  }

  @Override
  public void addPosts(Posts posts) {
  postRepository.save(posts);
  }

  @Override
  public Posts findById(Long id) {
    Posts posts = new Posts();
    if (postRepository.findById(id).isPresent()) {
      posts = postRepository.findById(id).get();
    }
    return posts;
  }

  @Override
  public Iterable<Posts> getPosts() {
    return postRepository.findAll();
  }

  @Override
  public void countVotes(String vote, long id) {
  if (vote.equals("up")) {
    Optional<Posts> optionalPosts = postRepository.findById(id);
    if (optionalPosts.isPresent()) {
      Posts a = optionalPosts.get();
      a.setNumberOfVotes(a.getNumberOfVotes() + 1);
      postRepository.save(a);
    } else {

    }
  } else if (vote.equals("down")) {
      Optional<Posts> optionalPosts = postRepository.findById(id);
      if (optionalPosts.isPresent()) {
        Posts a = optionalPosts.get();
        a.setNumberOfVotes(a.getNumberOfVotes() - 1);
        postRepository.save(a);
    } else {
      }
    }
  }

  @Override
  public List<Posts> sortPostsByVote() {
    return postRepository.getAllByOrdOrderByNumberOfVotes();
  }

  @Override
  public void addUserToPosts(Long userId, Long postsId) {
    Posts posts = findById(postsId);
    User user = userService.findById(userId);
    posts.setUser(user);
    postRepository.save(posts);

  }
}

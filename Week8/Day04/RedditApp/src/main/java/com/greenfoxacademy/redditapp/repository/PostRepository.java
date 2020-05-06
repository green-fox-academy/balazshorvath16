package com.greenfoxacademy.redditapp.repository;

import com.greenfoxacademy.redditapp.models.Posts;
import java.util.List;
import javax.swing.CellRendererPane;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Posts, Long> {

  @Query(value = "SELECT * FROM reddit_posts ORDER BY number_of_votes DESC", nativeQuery = true)
  List<Posts> getAllByOrdOrderByNumberOfVotes();
}

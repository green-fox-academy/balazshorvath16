package com.greenfoxacademy.redditapp.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Posts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String url;
  private long numberOfVotes;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn
  private User user;

  public Posts() {
  }

  @Temporal(TemporalType.DATE)
  private Date date;


  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getNumberOfVotes() {
    return numberOfVotes;
  }

  public void setNumberOfVotes(long numberOfVotes) {
    this.numberOfVotes = numberOfVotes;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
  public Posts(String title, String url) {
    this.title = title;
    this.url = url;
    numberOfVotes = 0;
    this.date = new Date();
  }
}

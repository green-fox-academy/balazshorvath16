package com.greenfoxacademz.frontend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = {"name", "title"})
public class Greeter {

  private String name;
  private String title;

  @JsonProperty("welcome_message")
  private String welcomeMessage;

  public String getName() {
    return name;
  }
  public Greeter(String name, String title) {
    this.name = name;
    this.title = title;
    welcomeMessage = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWelcomeMessage() {
    return welcomeMessage;
  }

  public void setWelcomeMessage(String welcome_message) {
    this.welcomeMessage= welcome_message;
  }

  public Greeter() {
  }


}

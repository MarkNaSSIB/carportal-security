package com.quintrix.carportal.security.security.model;

public class UserModel {

  private String fullName;
  private String userName;
  private String email;
  private String password;
  private String matchingPassword;

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getMatchingPassword() {
    return matchingPassword;
  }

  public void setMatchingPassword(String matchingPassword) {
    this.matchingPassword = matchingPassword;
  }

  public UserModel(String fullName, String userName, String email, String password,
      String matchingPassword) {
    super();
    this.fullName = fullName;
    this.userName = userName;
    this.email = email;
    this.password = password;
    this.matchingPassword = matchingPassword;
  }


}

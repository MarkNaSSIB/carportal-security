package com.quintrix.carportal.security.security.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.carportal.security.security.entity.User;
import com.quintrix.carportal.security.security.model.UserModel;
import com.quintrix.carportal.security.security.service.UserService;

@RestController
public class SecurityCtrl {

  @Autowired
  private UserService userService;


  @PostMapping("/register")
  public String registerUser(@RequestBody UserModel userModel) {
    User user = userService.registerUser(userModel);
    return "Success";

  }

}

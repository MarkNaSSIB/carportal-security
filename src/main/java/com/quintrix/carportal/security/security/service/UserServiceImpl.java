package com.quintrix.carportal.security.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.quintrix.carportal.security.security.entity.User;
import com.quintrix.carportal.security.security.model.UserModel;
import com.quintrix.carportal.security.security.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepo userRepo;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  public User registerUser(UserModel userModel) {
    // generate user entity from user model
    User newUser = new User(userModel.getFullName(), userModel.getUserName(), userModel.getEmail(),
        passwordEncoder.encode(userModel.getPassword()), "USER");
    /*
     * User newUser = new User(); newUser.setFullName(userModel.getFullName());
     * newUser.setEmail(userModel.getEmail()); newUser.setUserName(userModel.getUserName());
     * newUser.setPassword(userModel.getPassword()); newUser.setRole("USER");
     */

    userRepo.save(newUser);
    return newUser;
  }

}

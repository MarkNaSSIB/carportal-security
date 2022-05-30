package com.quintrix.carportal.security.security.service;

import com.quintrix.carportal.security.security.entity.User;
import com.quintrix.carportal.security.security.model.UserModel;

public interface UserService {

  User registerUser(UserModel userModel);

}

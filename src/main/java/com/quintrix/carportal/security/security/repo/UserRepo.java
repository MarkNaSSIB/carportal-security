package com.quintrix.carportal.security.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.quintrix.carportal.security.security.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}

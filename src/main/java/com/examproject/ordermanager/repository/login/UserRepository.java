package com.examproject.ordermanager.repository.login;

import com.examproject.ordermanager.model.login.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, Integer> {

    List<User> findByUsername(String username);
}

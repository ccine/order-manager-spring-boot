package com.examproject.ordermanager.resolver;

import com.examproject.ordermanager.model.login.User;
import com.examproject.ordermanager.repository.login.UserRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserResolver implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;

    public UserResolver(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Boolean checkUser(String username, String password) {
        List<User> users = userRepository.findByUsername(username);
        if(users.size() == 1){
            return users.get(0).getPassword().equals(password);
        }
        return false;
    }
}

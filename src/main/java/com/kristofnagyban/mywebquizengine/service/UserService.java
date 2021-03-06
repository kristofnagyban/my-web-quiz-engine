package com.kristofnagyban.mywebquizengine.service;

import com.kristofnagyban.mywebquizengine.domain.User;
import com.kristofnagyban.mywebquizengine.dto.UserCreateData;
import com.kristofnagyban.mywebquizengine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    // TODO data validation
    public String createUser(UserCreateData data) {
        User user = new User();
        user.setFirstName(data.getFirstName());
        user.setLastName(data.getLastName());
        user.setEmail(data.getEmail());
        user.setPasswordHashed(data.getPassword());
        user.setRegistrationDate(LocalDate.now());
        try {
            userRepository.save(user);
            return "User successfully created";
        } catch (IllegalArgumentException e) {
            return "Please check your entered data";
        }
    }
}

package com.kristofnagyban.mywebquizengine.service;

import com.kristofnagyban.mywebquizengine.domain.User;
import com.kristofnagyban.mywebquizengine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    private final UserRepository<User, Long> userRepository;

    @Autowired
    private UserService(UserRepository<User, Long> userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
}

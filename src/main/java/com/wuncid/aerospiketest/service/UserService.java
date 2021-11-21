package com.wuncid.aerospiketest.service;

import com.wuncid.aerospiketest.model.User;
import com.wuncid.aerospiketest.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public Optional<User> findUserById(int id) {
        return userRepository.findById(id);
    }
    public void addUser(User user) {
        userRepository.save(user);
    }
    public void removeUserById(int id) {
        userRepository.deleteById(id);
    }
}

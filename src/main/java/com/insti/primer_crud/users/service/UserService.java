package com.insti.primer_crud.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insti.primer_crud.users.model.User;
import com.insti.primer_crud.users.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User newUser) {
        return userRepository.save(newUser);
    }

    public User updateUser(Long id, User userDetails) {
        User user = userRepository.findById(id).orElse(null);
        user.setNombre(userDetails.getNombre());
        user.setApellido(userDetails.getApellido());

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElse(null);
        userRepository.delete(user);
    }

}
package ru.mansur.userservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mansur.userservice.model.User;
import ru.mansur.userservice.repository.UserRepository;
import ru.mansur.userservice.service.UserService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;


    @Override
     public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElseGet(userOptional::get);
    }

    @Override
    public void updateUser(Long id, String newName) {
        //
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

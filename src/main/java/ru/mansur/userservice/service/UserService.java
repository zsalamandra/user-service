package ru.mansur.userservice.service;

import ru.mansur.userservice.model.User;

public interface UserService {
    void addUser(User user);

    User getUser(Long id);

    void updateUser(Long id, String newName);

    void deleteUser(Long id);
}

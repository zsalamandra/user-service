package ru.mansur.userservice.service;

import ru.mansur.userservice.model.User;
import ru.mansur.userservice.model.dto.UserDto;

public interface UserService {
    void addUser(User user);

    UserDto getUser(Long id);

    void updateUser(Long id, String newName);

    void deleteUser(Long id);
}

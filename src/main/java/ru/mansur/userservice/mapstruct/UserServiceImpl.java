package ru.mansur.userservice.mapstruct;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mansur.userservice.exceptions.UserNotFoundExceptions;
import ru.mansur.userservice.model.User;
import ru.mansur.userservice.model.dto.UserDto;
import ru.mansur.userservice.repository.UserRepository;
import ru.mansur.userservice.service.UserService;
import ru.mansur.userservice.service.impl.UserMapper;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final static String USER_NOT_FOUND = "User not found";

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public UserDto getUser(Long id) {
        Optional<User> userById = userRepository.findById(id);

        if (userById.isEmpty()) {
            throw new UserNotFoundExceptions(USER_NOT_FOUND);
        }

        return userMapper.toDto(userById.get());
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

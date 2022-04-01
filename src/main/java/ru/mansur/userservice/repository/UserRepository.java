package ru.mansur.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mansur.userservice.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
}

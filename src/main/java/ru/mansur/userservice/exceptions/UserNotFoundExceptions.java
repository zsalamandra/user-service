package ru.mansur.userservice.exceptions;

public class UserNotFoundExceptions extends RuntimeException{

    public UserNotFoundExceptions(String message) {
        super(message);
    }
}

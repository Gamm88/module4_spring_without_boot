package ru.practicum.user;

import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public List<User> getAllUsers() {
        log.info("Поиск всех пользователей");
        return repository.findAll();
    }

    @Override
    public User saveUser(User user) {
        log.info("Сохранение пользователя ={}", user);
        return repository.save(user);
    }
}
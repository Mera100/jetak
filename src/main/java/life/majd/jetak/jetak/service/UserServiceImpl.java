package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.model.Role;
import life.majd.jetak.jetak.model.User;
import life.majd.jetak.jetak.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to the database", user.getFirstName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }

    @Override
    public User getUser(String username) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}

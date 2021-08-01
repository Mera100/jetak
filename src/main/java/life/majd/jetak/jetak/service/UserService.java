package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.model.User;
import life.majd.jetak.jetak.model.Role;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}

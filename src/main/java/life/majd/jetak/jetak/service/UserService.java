package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.domain.User;
import life.majd.jetak.jetak.domain.Role;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> saveUsers(List<User> user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}

package ongiuaky.ongiuaky.service;

import ongiuaky.ongiuaky.authen.UserPrincipal;
import ongiuaky.ongiuaky.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}

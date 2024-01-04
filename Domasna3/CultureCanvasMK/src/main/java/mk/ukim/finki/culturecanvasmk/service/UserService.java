package mk.ukim.finki.culturecanvasmk.service;

import mk.ukim.finki.culturecanvasmk.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> listUsers();

    Boolean checkUsernameAndPassword(String username, String password);

    User findByUsernameAndPassword(String username, String password);

    Boolean registerUser(String firstName, String lastName, String username, String password);

    void deleteById(Long userId);
}

package ongiuaky.ongiuaky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ongiuaky.ongiuaky.entity.User;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}

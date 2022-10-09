package ongiuaky.ongiuaky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ongiuaky.ongiuaky.entity.Token;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}

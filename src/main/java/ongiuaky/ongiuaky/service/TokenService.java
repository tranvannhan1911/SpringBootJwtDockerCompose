package ongiuaky.ongiuaky.service;

import ongiuaky.ongiuaky.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}

package com.exredis.repository;

import com.exredis.domain.entity.Token;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TokenRedisRepositoryTest {

    @Autowired
    TokenRedisRepository tokenRedisRepository;

    @Test
    void test(){
        Token token = new Token(1l, "abcd", "bbbb");

        tokenRedisRepository.save(token);

        tokenRedisRepository.findById(token.getId());

        tokenRedisRepository.count();

        //tokenRedisRepository.delete(token);
    }
}
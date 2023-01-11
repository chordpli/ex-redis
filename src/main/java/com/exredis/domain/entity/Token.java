package com.exredis.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@AllArgsConstructor
@Getter
@RedisHash(value = "jwt", timeToLive = 30)
public class Token {

    @Id
    private Long id;
    private String accessToken;
    private String refreshToken;
}

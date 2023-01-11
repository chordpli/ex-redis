package com.exredis.repository;

import com.exredis.domain.entity.Token;
import org.springframework.data.repository.CrudRepository;

public interface TokenRedisRepository extends CrudRepository<Token, Long> {
}

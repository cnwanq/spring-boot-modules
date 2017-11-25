package com.wanq.springboot.mongodb.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);

}

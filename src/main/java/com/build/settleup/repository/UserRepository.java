package com.build.settleup.repository;

import com.build.settleup.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository  extends MongoRepository<Users,String> {
    Optional<Users> findByEmail(String email);
}

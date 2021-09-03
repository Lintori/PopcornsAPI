package com.lintori.rebyu.Repository;
import com.lintori.rebyu.Entities.User;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository <User, Long> {
    
}

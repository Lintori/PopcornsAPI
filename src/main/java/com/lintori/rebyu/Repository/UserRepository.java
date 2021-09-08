package com.lintori.rebyu.Repository;
import com.lintori.rebyu.Entities.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository <User, Long> {
    
}

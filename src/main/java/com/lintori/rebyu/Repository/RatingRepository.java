package com.lintori.rebyu.Repository;

import com.lintori.rebyu.Entities.Rating;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {
    
}

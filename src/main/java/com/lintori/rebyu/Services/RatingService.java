package com.lintori.rebyu.Services;

import com.lintori.rebyu.Entities.*;
import com.lintori.rebyu.Repository.RatingRepository;
import java.util.List;

public class RatingService {

    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List <Rating> findAllUsers(){
        return this.ratingRepository.findAll();
    }

    public Rating findUser (Long id){
        return this.ratingRepository.findById(id).orElse(null);
    }

    public void addUser (Rating rating){
        this.ratingRepository.save(rating);   
    }

    public void updateRating (Rating updateRating, Long id){
        Rating rating = this.ratingRepository.findById(id).orElse(null);
        rating.setMovieTitle(updateRating.getMovieTitle());
        rating.setRating(updateRating.getRating());
        rating.setReview(updateRating.getReview());
        this.ratingRepository.save(rating);
    }

    public void deleteUser(Long id){
        this.ratingRepository.deleteById(id);
    }

    
    
}

package com.lintori.rebyu.Services;

import java.util.*;
import com.lintori.rebyu.Entities.Review;
import com.lintori.rebyu.Repository.ReviewRepository;

public class ReviewService {

    private final ReviewRepository reviewRepository;
    
    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    public List <Review> findAllReviews(){
        return this.reviewRepository.findAll();
    }

    public Review findReview (Long id){
        return this.reviewRepository.findById(id).orElse(null);
    }

    public void addReview (Review review){
        this.reviewRepository.save(review);   
    }

    public void updateReview(Review updatedReview, Long id){
        Review review = this.reviewRepository.findById(id).orElse(null);
        //review.getDescription(updatedReview.setDescription());
        this.reviewRepository.save(review);
    }

    public void deleteReview(Long id){
        this.reviewRepository.deleteById(id);
    }
}

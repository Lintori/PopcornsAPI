package com.lintori.rebyu.Routes;

import com.lintori.rebyu.Entities.Review;
import com.lintori.rebyu.Services.ReviewService;
import org.springframework.web.bind.annotation.*;

//import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewRoutes {

    private final ReviewService reviewService;

    public ReviewRoutes(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
    
    @GetMapping()
	public List<Review> getAllReviews() {
		return this.reviewService.findAllReviews();
    }

    @GetMapping("/{id}")
    public Review getReview(@PathVariable (value = "id") Long requestID){
        return reviewService.findReview(requestID);
    }

    @PostMapping("/{id}")
	public void postReview(@RequestBody Review requestReview) {
		this.reviewService.addReview(requestReview);
	}

    @PutMapping("/{id}")
	public void putReview(@RequestBody Review requestReview, @PathVariable(value = "id") long requestID) {
		this.reviewService.updateReview(requestReview, requestID);
	}

    @DeleteMapping("/{id}")
	public void deleteReview(@PathVariable(value = "id") long requestID) {
		this.reviewService.deleteReview(requestID);
	}
}

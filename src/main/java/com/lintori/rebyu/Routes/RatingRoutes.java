package com.lintori.rebyu.Routes;

import com.lintori.rebyu.Entities.Rating;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/ratings")
public class RatingRoutes {

    @GetMapping()
    public ArrayList<Rating> getAllRatings() {
        ArrayList<Rating> allRatings = new ArrayList<>();
        allRatings.add(new Rating(
                (long) 1,
                "movieTitle",
                5,
                "Excelente pelicula"
        ));
        return allRatings;
    }

    @GetMapping("/{id}")
    public Rating getRating(
            @PathVariable(value="id") int requestID
    ) {
        return new Rating(
                (long) 1,
                "movieTitle",
                5,
                "Excelente pelicula"
        );
    }

    @PostMapping()
    public void postRating(
            @RequestBody Rating requestRating
    ) {

    }

    @PutMapping("/{id}")
    public void putRating(
            @PathVariable(value="id") int requestID
    ) {

    }

    @DeleteMapping("/{id}")
    public void deleteRating(
            @PathVariable(value="id")  int requestID
    ) {

    }
}

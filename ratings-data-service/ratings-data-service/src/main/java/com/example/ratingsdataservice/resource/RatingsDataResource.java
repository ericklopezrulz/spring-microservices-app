package com.example.ratingsdataservice.resource;

import com.example.ratingsdataservice.models.Rating;
import com.example.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping(value = "/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieID) {

        return new Rating(movieID, 4);
    }
    @RequestMapping(value = "/users/{userId}")
    public UserRating getUserRating() {
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );
        UserRating userRatings= new UserRating();
        userRatings.setUserRating(ratings);
        return userRatings;
    }


}

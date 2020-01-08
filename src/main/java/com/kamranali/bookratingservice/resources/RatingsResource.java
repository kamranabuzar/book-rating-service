package com.kamranali.bookratingservice.resources;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kamranali.bookratingservice.models.Rating;
import com.kamranali.bookratingservice.models.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{bookId}")
    public Rating getRating(@PathVariable ("bookId") String bookId) {
        return new Rating(bookId, 5);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable ("userId") String userId) {
        List<Rating> ratings= Arrays.asList(
                new Rating("1001", 5),
                new Rating("3312", 4),
                new Rating("9907", 4),
                new Rating("1111", 4)

        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}

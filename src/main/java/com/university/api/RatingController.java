package com.university.api;

import com.university.entity.CourseRating;
import com.university.service.RatingService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rating")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @GetMapping(value = "/getRating")
    public List<CourseRating> getRating(){
        return ratingService.getAll();
    }

    @PostMapping(value = "/addRating")
    public CourseRating addRating(@RequestParam String surname, @RequestParam String name, @RequestParam int rating){
       return ratingService.addRating(surname, name, rating);
    }
}

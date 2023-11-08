package com.gfa.trackmeals.controller.API;

import com.gfa.trackmeals.domain.Meal;
import com.gfa.trackmeals.service.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class MealController {

    private final MealService mealService;

    @PostMapping("/addNewMeal")
    public ResponseEntity<Meal> addNewMeal(@RequestParam String name,
                                           @RequestParam long calories) throws Exception {
        return ResponseEntity.ok(mealService.addNewMeal(name, calories));
    }

    @GetMapping("/getAllMeals")
    public ResponseEntity<List<Meal>> getAllMeals() {
        return ResponseEntity.ok(mealService.getAllMeals());
    }
}

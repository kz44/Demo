package com.gfa.trackmeals.service;

import com.gfa.trackmeals.domain.Meal;
import com.gfa.trackmeals.dto.MealRequestDTO;
import com.gfa.trackmeals.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MealServiceImp implements MealService{

    private final MealRepository mealRepository;

    @Override
    public Meal addNewMeal(String name, long calories) throws Exception {
        if (name.isEmpty() || calories < 0) {
            throw new Exception("The given parameter is invalid");
        }
        Meal newMeal = Meal.builder()
                .name(name)
                .calories(calories)
                .date(LocalDate.now())
                .build();

        try {
            mealRepository.save(newMeal);
        } catch (Exception e) {
            throw new Exception("The saving process was unsuccessful");
        }
        return newMeal;
    }

    @Override
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    @Override
    public Meal updateMeal(Long id, MealRequestDTO dto) throws Exception {
        return null;
    }

    @Override
    public void deleteMeal(Long id) throws Exception {

    }

    @Override
    public Meal getMealById(Long id) throws Exception {
        return null;
    }

    @Override
    public long getSumOfCalories(LocalDate date) throws Exception {
        return 0;
    }
}

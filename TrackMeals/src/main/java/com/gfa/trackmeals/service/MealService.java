package com.gfa.trackmeals.service;

import com.gfa.trackmeals.domain.Meal;
import com.gfa.trackmeals.dto.MealRequestDTO;

import java.time.LocalDate;
import java.util.List;

public interface MealService {
    Meal addNewMeal(String name, long calories) throws Exception;

    List<Meal> getAllMeals();

    Meal updateMeal(Long id, MealRequestDTO dto) throws Exception;

    void deleteMeal(Long id) throws Exception;

    Meal getMealById(Long id) throws Exception;

    long getSumOfCalories(LocalDate date) throws Exception;
}

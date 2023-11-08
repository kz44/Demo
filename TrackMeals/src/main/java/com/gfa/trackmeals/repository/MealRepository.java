package com.gfa.trackmeals.repository;

import com.gfa.trackmeals.domain.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {

}

package com.fitnesstracker.test;

import com.fitnesstracker.se.model.BoxingTraining;
import org.junit.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FitnessTrackerTest {
    @Test
    public void testForIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BoxingTraining(-1, 50, 80);
        });
    }

    @Test
    public void testForCorrectE(){
        Optional<BoxingTraining> boxingOpt = Optional.of(new BoxingTraining(120,50, 80));
        Double calories = boxingOpt.map(workout -> workout.calculateCalories()).orElse(0.);
        assertEquals(414.4, calories);
    }
}

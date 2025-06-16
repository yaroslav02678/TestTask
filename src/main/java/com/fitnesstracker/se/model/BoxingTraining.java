package com.fitnesstracker.se.model;

public class BoxingTraining extends Workout {
    public BoxingTraining(int averageHearRate, int durationMinutes, int athleteWeight) {
        super(averageHearRate, durationMinutes, athleteWeight);
    }

    @Override
    public String toString() {
        return "Тренування з кікбоксингу! Тривалість: " + durationMinutes  + " хв. "
                + "Кілокалорії: " + calculateCalories();
    }
}

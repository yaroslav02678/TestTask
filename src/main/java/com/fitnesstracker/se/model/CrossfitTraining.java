package com.fitnesstracker.se.model;

public class CrossfitTraining extends Workout {
    private int averageWeightBarbell;

    public CrossfitTraining(int averageHearRate, int durationMinutes, int athleteWeight, int averageWeightBarbell) {
        super(averageHearRate, durationMinutes, athleteWeight);
        this.averageWeightBarbell = averageWeightBarbell;
    }

    int getAverageWeightBarbell() {
        return this.averageWeightBarbell;
    }

    void setAverageWeightBarbell(int averageWeightBarbell) {
        if (averageWeightBarbell < 0) throw new IllegalArgumentException("cannnot have negative weights");
        this.averageWeightBarbell = averageWeightBarbell;
    }

    @Override
    public String toString() {
        return "Кросфіт тренування! Тривалість: " + durationMinutes  + " хв. "
                + "Середня вага штанги: " + averageWeightBarbell + " кг. "
                + "Кілокалорії: " + calculateCalories();
    }
}

package com.fitnesstracker.se.model;

public class RunningTraining extends Workout {
    private int distance;

    public RunningTraining(int averageHearRate, int durationMinutes, int athleteWeight, int distance) {
        super(averageHearRate, durationMinutes, athleteWeight);
        this.distance = distance;
    }

    int getDistance() {
        return this.distance;
    }

    void setDistance(int distance) {
        if (distance < 0) throw new IllegalArgumentException("cannot have negative distance");
        this.distance = distance;
    }

    @Override
    public String toString() {
        return  "Бігове тренування! Тривалість: "+ durationMinutes  + " хв. "
                + "Дистанція: " + distance + " км. "
                + "Кілокалорії: " + calculateCalories();
    }
}

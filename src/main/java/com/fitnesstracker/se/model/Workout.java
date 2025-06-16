package com.fitnesstracker.se.model;

import java.util.Objects;

public abstract class Workout {
    protected int averageHearRate;
    protected int durationMinutes;
    protected int athleteWeight;

    public Workout(){
        this.averageHearRate = 0;
        this.durationMinutes = 0;
        this.athleteWeight = 0;
    }

    public Workout(int averageHearRate, int durationMinutes, int athleteWeight){
        if (averageHearRate < 0 || durationMinutes < 0 || athleteWeight < 0){
            throw new IllegalArgumentException();
        }
        this.averageHearRate = averageHearRate;
        this.durationMinutes = durationMinutes;
        this.athleteWeight = athleteWeight;
    }

    public Workout(Workout other){
        this.averageHearRate = other.averageHearRate;
        this.durationMinutes = other.durationMinutes;
        this.athleteWeight = other.athleteWeight;
    }

    public double calculateCalories(){
        double calories = 0.014 * athleteWeight * durationMinutes * (0.12 * averageHearRate - 7);
        return Math.round(calories * 10) / 10.0;
    };

    public abstract String toString();

    public int getAverageHeartRate() { return this.averageHearRate; }

    public int getDurationMinutes() { return this.durationMinutes; }

    public int getSportsmanWeight() { return this.athleteWeight; }

    public void setAverageHeartRate(int averageHeartRate) {
        if (averageHeartRate < 0) throw new IllegalArgumentException("cannot have negative average heart rate");
        this.averageHearRate = averageHeartRate;
    }

    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes < 0) throw new IllegalArgumentException("cannot have negative duration minutes");
        this.durationMinutes = durationMinutes;
    }

    public void setSportsmanWeight(int sportsmanWeight) {
        if (sportsmanWeight < 0) throw new IllegalArgumentException("cannot have negative sportsman weight");
        this.athleteWeight = sportsmanWeight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Workout other = (Workout) obj;
        return averageHearRate == other.averageHearRate &&
                durationMinutes == other.durationMinutes &&
                athleteWeight == other.athleteWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageHearRate, durationMinutes, athleteWeight);
    }
}

package com.fitnesstracker.se.main;

import com.fitnesstracker.se.model.BoxingTraining;
import com.fitnesstracker.se.model.CrossfitTraining;
import com.fitnesstracker.se.model.RunningTraining;
import com.fitnesstracker.se.model.Workout;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RunningTraining runningTraining1 = new RunningTraining(1, 60, 99, 10 );
        RunningTraining runningTraining2 = new RunningTraining(90, 20, 80, 5 );
        CrossfitTraining crossfitTraining3 = new CrossfitTraining(85, 50, 90,90);
        BoxingTraining boxingTraining4 = new BoxingTraining(85, 120, 90);

        ArrayList<Workout> workouts = new ArrayList<>();

        workouts.add(runningTraining1);
        workouts.add(runningTraining2);
        workouts.add(crossfitTraining3);
        workouts.add(boxingTraining4);

        for (Workout workout : workouts) {
            System.out.println(workout);
        }
    }
}

// Develop a Java program that will store data in the form of daily average temperatures for one week. Store the day and average temperature in two different arraylists. Your program should prompt the user for the day of the week (Monday through Sunday) and display both the day and temperature for each day. If "week" is entered, the output for your program should provide the temperature for each day and the weekly average. Use the looping and decision constructs in combination with the arrays to complete this assignment.

// Compile and submit your pseudocode, source code, and screenshots of the application executing the application, the results and GIT repository in a single document.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday"); 
        days.add("Sunday");
        System.out.println(days);
        second(args);
    }

    public static void second(Double[] args) {
        ArrayList<Double> tempature = new ArrayList<Double>();
        tempature.add(73.0);
        tempature.add(70.0);
        tempature.add(48.0);
        tempature.add(55.0);
        tempature.add(47.0);
        tempature.add(50.0); 
        tempature.add(39.0);
        System.out.println(tempature);


        double sum = 0;
        for (double t : tempature) {
            sum += t;
        }
        double average = 0;
        average = sum / 7;
        System.out.println("Average Tempature:" + average);
    }

}

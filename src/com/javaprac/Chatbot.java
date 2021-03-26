package com.javaprac;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instantiated a Scanner object
        System.out.println("Hi I'm the chatbot.");
        System.out.println("May I know your name?");

        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name);

        System.out.println("I'm going to try to guess your age.");
        System.out.println("What's the remainder of your age divided by 5?");
        int ageMod5 = scanner.nextInt();

        System.out.println("Thanks -- What's the remainder of your age divided by 5?");
        int ageMod7 = scanner.nextInt();

        System.out.println("Finally, What's the remainder of your age divided by 5?");
        int ageMod9 = scanner.nextInt();

        System.out.println("You wrote " + ageMod5 + ", " + ageMod7 + ", " + ageMod9);

        // deduce the age
        int age = 0;
        int potentialAge = 1;
        while (potentialAge <= 120) {
            if (        potentialAge % 5 == ageMod5
                     && potentialAge % 7 == ageMod7
                     && potentialAge %9 == ageMod9
            ) {
                age = potentialAge;
            }

            potentialAge++;
        }

        if (age == 0) {
            System.out.println("Error: age not identified");
        } else {
            System.out.println("Your age is" + age);
        }
    }
}

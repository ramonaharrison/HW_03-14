package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * LostInTheUniverse.java
 * A celestial text-based adventure game
 **/

import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;


public class Main {
    public static void main(String[] args) {

        // inventory:
        boolean hasFlowers = false;
        boolean hasArrowhead = false;
        boolean hasScrewdriver = false;
        boolean hasAndroidPhone = false;
        boolean hasMotherboard = false;
        boolean hasManual = false;

        // in scene:
        boolean isFlowers = false;
        boolean isArrowhead = false;
        boolean isScrewdriver = false;
        boolean isAndroidPhone = false;
        boolean isMotherboard = false;
        boolean isManual = false;

        Scanner input = new Scanner(System.in);
        String startPrompt;

        System.out.println(Screen.title());
        System.out.println(Screen.byline());
        System.out.println("type 'start' to begin");


        while(true) {

            startPrompt = input.next();
            if (startPrompt.equalsIgnoreCase("start")) {

                // randomly generated star scroll

                Random random = new Random();
                String starLine = "";
                int starSpacing = 80;                       // increasing this value decreases the concentration of stars

                for (int i = 0; i < 300; i++) {             // lengthens the scroll
                    for (int j = 0; j < 220; j++) {         // widens the scroll
                        int number = random.nextInt(starSpacing);
                        if (number < 3) {
                            starLine = starLine + "☆";
                        } else if (number == 3) {
                            starLine = starLine + "✧";
                        } else if (number == 4) {
                            starLine = starLine + "˳";
                        } else if (number == 5) {
                            starLine = starLine + "༚";
                        } else {
                            starLine = starLine + " ";
                        }
                    }
                    if (i == 280) {                             // determines position of scene in scroll
                        // First intro scene
                        System.out.println(Screen.firstScene());
                    } else {
                        System.out.println(starLine);
                        starSpacing += 5;                       // thins stars as scroll progresses
                        starLine = "";
                        try {
                            Thread.sleep(10);                   // increasing this value slows the scrolling
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }

                // Waits for user input to continue // TODO: Wish I could make this just hit 'enter', refactor into method
                boolean enter = false;
                System.out.println("'y' to continue>");
                while(!enter) {
                    String prompt = input.next();
                    if (prompt.equals("y")) {
                        enter = true;
                    }
                }

                // second intro scene
                // third intro scene

                // start of user play



            }
        }
    }
}

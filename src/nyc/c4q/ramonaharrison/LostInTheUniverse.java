package nyc.c4q.ramonaharrison;

/**
 * Access Code 2.1
 * Ramona Harrison
 * LostInTheUniverse.java
 * A celestial text-based adventure game
 **/

import java.util.Random;
import java.util.Scanner;

public class LostInTheUniverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String startPrompt;

        System.out.println(Screen.title());
        System.out.println(Screen.byline());
        System.out.println("type 'start' to begin");

        startPrompt = input.next();
        if (startPrompt.equalsIgnoreCase("start")) {

            // randomly generated star scroll

            Random random = new Random();
            String starLine = "";
            int starSpacing = 80;                       // increasing this value decreases the concentration of stars

            for (int i = 0; i < 400; i++) {             // lengthens the scroll
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
                if (i == 380) {                             // determines position of scene in scroll
                    // first scene
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

            System.out.println("press space to continue>");
        }
    }
}

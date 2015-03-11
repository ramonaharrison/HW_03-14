package nyc.c4q.ramonaharrison;

/**
 * Ramona Harrison
 * Access Code 2.1
 * Input.java
 * This class deals with user input
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) throws IOException {

        // location:
        String location = "spaceship";

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
        boolean isManual = false;

        // once panelFixed is true, you win the game
        boolean panelFixed = false;


        // The following block is adapted from Alex's code in the Roman Numeral Calculator.java class
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Loop forever.
        while (true) {
            // Show the prompt.
            System.out.print("> ");
            // Read a line of input.
            final String line = reader.readLine();
            if (line.equalsIgnoreCase("help")) {
                System.out.println(Screen.help());
            } else if (line.equalsIgnoreCase("map")) {
                System.out.println(Screen.map());
            } else if (line.equalsIgnoreCase("inventory")) {
                System.out.println(Screen.inventory());
            } else {
                // Scans user input into three parts: verb, preposition, and noun.
                final Scanner scanner = new Scanner(line);
                final String verb, preposition, noun;
                try {
                    verb = scanner.next();
                    preposition = scanner.next();
                    noun = scanner.next();
                } catch (NoSuchElementException e) {
                    System.out.println("sorry, i don't understand... enter 'help' to view commands");
                    continue;
                }

                // interprets user input
                if (verb.equalsIgnoreCase("pick")) { // deals with picking up objects

                    if (noun.equalsIgnoreCase("flowers") && isFlowers == true && hasFlowers == false) {
                        hasFlowers = true;
                        isFlowers = false;
                        System.out.println("you pick up the delicate blue flowers. they remind you of home.");
                    } else if (noun.equalsIgnoreCase("arrowhead") && isArrowhead == true && hasArrowhead == false) {
                        hasArrowhead = true;
                        isArrowhead = false;
                        System.out.println("you pick up the arrowhead. its edge is very sharp.");
                    } else if (noun.equalsIgnoreCase("screwdriver") && isScrewdriver == true && hasScrewdriver == false) {
                        hasScrewdriver = true;
                        isScrewdriver = false;
                        System.out.println("you pick up the screwdriver. it has a very tiny head.");
                    } else if (noun.equalsIgnoreCase("android") && isAndroidPhone == true && hasAndroidPhone == false) {
                        hasAndroidPhone = true;
                        isAndroidPhone = false;
                        System.out.println("you pick up the android phone. too bad earth hasn't gotten interstellar 4G yet...");
                    } else if (noun.equalsIgnoreCase("manual") && isManual == true && hasManual == false) {
                        hasManual = true;
                        isManual = false;
                        System.out.println("you pick up the manual. maybe there will be useful information inside.");
                    } else {
                        System.out.println("you can't pick that up.");
                    }

                } else if (verb.equalsIgnoreCase("look")) { // deals with looking at objects

                    if (noun.equalsIgnoreCase("flowers") && hasFlowers) {
                        System.out.println("such beautiful flowers, they remind you of home. you really must be getting back.");

                    } else if (noun.equalsIgnoreCase("arrowhead") && (hasArrowhead || isArrowhead)) {
                        System.out.println("what a fine tool. its edge is very sharp.");

                    } else if (noun.equalsIgnoreCase("screwdriver") && (hasScrewdriver || isScrewdriver)) {
                        System.out.println("this is a very tiny screwdriver. maybe intended for electronics repair?");

                    } else if (noun.equalsIgnoreCase("android-phone") && (hasAndroidPhone || isAndroidPhone)) {
                        System.out.println("a somewhat primitive technology. you wonder if earthling circuitry is similar to your own.");

                    } else if (noun.equalsIgnoreCase("motherboard") && (hasMotherboard)) {
                        System.out.println("a small green motherboard. it's not unlike your spaceship's motherboard.");

                    } else if (noun.equalsIgnoreCase("manual") && (hasManual || isManual)) {
                        System.out.println(Screen.manual());
                    } else {
                        System.out.println("You look at the " + noun + ". maybe it's a mirage?");
                    }

                } else if (verb.equalsIgnoreCase("go")) { // deals with moving between scenes

                    if (noun.equalsIgnoreCase("spaceship")) {
                        location = "spaceship";
                        if (!hasManual) {               // checks to see if objects from the scene are in inventory
                            isManual = true;            // if not, makes them available to pick up
                        }
                        System.out.print("your spaceship is nestled in the sand amongst shrubs and cacti.");
                        if (isManual) {
                            System.out.println("inside the spaceship is a manual. ");
                        }
                        if (!panelFixed) {
                            System.out.println("light curls of smoke drift from the motherboard panel. you wish you could figure out how to get it working.");
                        }
                    } else if (noun.equalsIgnoreCase("rocky")) {
                        location = "rocky-outcrop";
                        if (!hasFlowers) {
                            isFlowers = true;
                        }
                        if (!hasArrowhead) {
                            isArrowhead = true;
                        }
                        System.out.println("you huff and puff to the top of the rocky outcrop. the desert stretches off for miles around you.\nfar off on the horizon you see the hazy skyline of an earthling city.");
                        if (isFlowers) {
                            System.out.println("lovely blue flowers dot the ground.");
                        }
                        if (isArrowhead) {
                            System.out.println("on the ground you notice a beam of sunlight reflecting off a tiny arrowhead. ");
                        }
                    } else if (noun.equalsIgnoreCase("gas")) {
                        location = "gas-station";
                        if (!hasScrewdriver) {
                            isScrewdriver = true;
                        }
                        if (!hasAndroidPhone) {
                            if (!hasMotherboard) {
                                isAndroidPhone = true;
                            }
                        }
                        System.out.println("the gas station is totally deserted. inside everything is covered with layer of sandy dust.");
                        if (isScrewdriver) {
                            System.out.println("hanging on the wall are some old tools. you notice a nice screwdriver.");
                        }
                        if (isAndroidPhone) {
                            System.out.println("on the counter is some assorted junk. you notice an android-phone. what a strange thing to leave behind.");
                        }
                    } else if (noun.equalsIgnoreCase("city")) {
                        System.out.println("you can't go there. you'll end up in a museum for sure");
                    } else {
                        System.out.println("i don't understand. enter 'map' to see locations you can go to.");
                    }

                } else if (verb.equalsIgnoreCase("use")) { // deals with using objects
                    if (noun.equalsIgnoreCase("arrowhead") || noun.equalsIgnoreCase("screwdriver") || noun.equalsIgnoreCase("motherboard")) {
                        System.out.print("use the " + noun + " on (enter an object)>");
                        String object = scanner.next();
                        if (location.equalsIgnoreCase("spaceship") && noun.equalsIgnoreCase("arrowhead") && hasArrowhead && hasMotherboard && object.equalsIgnoreCase("wires")) {
                            System.out.println("you use the arrowhead to cut the wires and remove the old motherboard. the new motherboard fits snugly into place and you twist the wires to connect it.");
                            panelFixed = true;
                        } else if (noun.equalsIgnoreCase("screwdriver") && hasScrewdriver && hasAndroidPhone && object.equalsIgnoreCase("android-phone")) {
                            System.out.println("you use the screwdriver to remove the back cover of the android-phone. inside is a small green circuit board. its not unlike the motherboard in your spaceship!");
                            hasAndroidPhone = false;
                            hasMotherboard = true;
                        } else if (location.equalsIgnoreCase("spaceship") && noun.equalsIgnoreCase("motherboard") && hasMotherboard && object.equalsIgnoreCase("spaceship")) {
                            System.out.println("you try to use the motherboard on the spaceship but the old motherboard is held in place by many wires. if only you had something to cut them with...");
                        } else {
                            System.out.printf("i'm not sure how you'd use the " + noun + " on the " + object + ".");
                        }
                    } else {
                        System.out.println("i don't know what you'd use that on!");
                    }
                } else {
                    System.out.println("sorry, i don't understand...\ntype 'help' to view commands");
                }
            }
        }
    }
}




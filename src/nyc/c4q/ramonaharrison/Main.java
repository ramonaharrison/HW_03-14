package nyc.c4q.ramonaharrison;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String firstChoice, secondChoice, thirdChoice;
        Scanner input = new Scanner(System.in);

        System.out.println("You are walking along in the forest on a beautiful day. " +
                "As you walk, you're enjoying the sounds of birds chirping and " +
                "leaves rustling in the breeze. \nSuddenly, you trip into a rabbit hole " +
                "and fall deep into the ground. Oh my! \n\nIn your pocket, you have a book of matches, " +
                "a magnifying glass, and two packets of Skittles.\n\n" +
                "What would you like to do?\n" +
                "(\"light a match\", \"use magnifying glass\", \"eat skittles\")");
            firstChoice = input.nextLine();


        if (firstChoice.equals("use magnifying glass")) {
            System.out.println("You can't see anything. You sit in the dark and sulk...\n");
        } else if (firstChoice.equals("eat skittles")) {
            System.out.println("You eat some skittles.\nYou can't see what color they are, but they taste good.\nYou get bored...\n\n");
        }

        System.out.println("You light a match and look around. \nSuddenly, you can see the space around " +
                "you. You are deep in the earth. \nTo your right, there is a tunnel that you can hear " +
                "music from. \nTo your left, another tunnel stretches off into the distance.\n\n" +
                "What would you like to do?\n" +
                "(\"go right\", \"go left\", \"eat skittles\")");
        secondChoice = input.nextLine();

        if (secondChoice.equals("go left")) {
            System.out.println("You walk left but quickly bump into the wall.\nYou turn around and walk right.");
        } else if (secondChoice.equals("eat skittles")) {
            System.out.println("You try to eat skittles but they fall on the ground.\n" +
                    "You decide to move on...");
        }
                    "What would you like to do?\n" +
                    "(\"go right\", \"go left\", \"eat skittles\")");
            thirdChoice = input.nextLine();

        }
    }

}


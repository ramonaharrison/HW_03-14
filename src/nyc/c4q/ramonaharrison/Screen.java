package nyc.c4q.ramonaharrison;

/**
 * Ramona Harrison
 * Access Code 2.1
 * Screen.java
 * This class contains Acsii backgrounds, images, and generators
 */

import java.util.Random;

public class Screen {

    // This function returns enough blank lines to clear the console

    public static String clearScreen() {

        String blank = "";

        for (int i = 0; i < 50; ++i) {
            blank = blank + "\n";
        }

        return blank;
    }


    // Title art

    public static String title() {

        return (        "                                           \n" +
                        "           d8P                             \n" +
                        "        d888888P                           \n" +
                        " .d888b,  ?88'   d888b8b    88bd88b .d888b,\n" +
                        " ?8b,     88P   d8P' ?88    88P'  ` ?8b,   \n" +
                        "   `?8b   88b   88b  ,88b  d88        `?8b \n" +
                        "`?888P'   `?8b  `?88P'`88bd88'     `?888P' \n" +
                        "                                           \n" +
                        "                                           ");
    }

    public static String byline() {

        return ("                                                                \n" +
                " _    _  _  _  _  |_      _ _  _  _  _  _   |_  _  _ _. _ _  _  \n" +
                "(_|  (_)(_||||(-  |_)\\/  | (_||||(_)| )(_|  | )(_|| | |_)(_)| ) \n" +
                "     _/              /                                          \n\n\n");
    }

    // The following functions return scene art

    public static String firstScene() {

        return ("                                                            ☆                                        \n" +
                "                                                                                                      \n" +
                "            ☆                              ˳✧༚                          ☆                             \n" +
                ".✧                                                                                                    \n" +
                "                          ☆                                                            ☆              \n" +
                "                                                                          •ི   •ྀ     - beep beep       \n" +
                "                                                                        (⊙ ﹏ ⊙ ✿)                    \n" +
                "                                                                         ૮[ ♡   ]ა                    \n" +
                "y o u    a r e    l o s t    i n    t h e    u n i v e r s e              ~~~~~~                      \n" +
                "                                                                           ミ ミ                       \n" +
                "            ☆                                                        ☆                        ˳✧༚     \n" +
                ".✧                                                                                                    \n" +
                "                          ☆                                                            ☆              \n" +
                "                                                                                                      \n");
    }

    public static String help() {
        return("help screen");
    }

    public static String map() {
        return("map screen");
    }

    public static String inventory() {
        return("inventory screen");
    }

    public static String manual() {
        return("manual screen");
    }

}

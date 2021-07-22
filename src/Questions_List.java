import java.util.Scanner;
/**
 * This is the class the holds and asks the user the various questions for the game.
 * Each method asks the player a question, prompts the user for an answer, and returns a String to
 * the Millionaire_Game class.
 *
 * @author Randi Lovelett
 * @version 12/09/15
 */
public class Questions_List
{
    Scanner answerScnr = new Scanner(System.in);
    int count = 0; //The question number the player is on.
    String letterSelection = ""; //The user's answer to a question

    /**
     * The list of questions given in round one. They are given in the order shown using
     * if-statements and counters.
     *
     * @return String answerType - indicator of whether or not an answer was answered correctly. Gets returned to
     * class Millionaire_Game to determine if the game will continue running or not.
     */
    public String questionSet1() {
        count++;
        String answerType = ""; //whether or not an answer is correct, this gets returned to class Millionaire_Game.
        if (count == 1) {
            //The first question of the game
            System.out.println("1) In the wireless phone abbreviation â€œ4G,â€ the â€œGâ€ stands for what?");
            System.out.println("  A. Gigabytes");
            System.out.println("  B. Generation");
            System.out.println("  C. Gillete");
            System.out.println("  D. Gram");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next(); //scan for the users answer.
            if (letterSelection.equalsIgnoreCase("B")) {
                //if the users answer matches the letter, it's correct.
                System.out.println("Correct!");
                System.out.println("You have won $100 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect"; //if the answer is anything but the answer, the user is incorrect.
                return answerType;
            }
        }
        else if (count == 2) {
            //The second question of the game.
            System.out.println("2) What pop star made his TV acting debut in 2010, playing teenage bomber Jason McCann on â€œCSIâ€?");
            System.out.println("  A. Harry Styles");
            System.out.println("  B. Ross Lynch");
            System.out.println("  C. Justin Bieber");
            System.out.println("  D. Cody Simpson");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("C")) {
                System.out.println("Correct!");
                System.out.println("You have won $300 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 3) {
            System.out.println("3) Someone or something that is given up for the common good is often called the â€œsacrificialâ€ what?");
            System.out.println("  A. Cow");
            System.out.println("  B. Dove");
            System.out.println("  C. Lamb");
            System.out.println("  D. Pig");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("C")) {
                System.out.println("Correct!");
                System.out.println("You have won $500 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 4) {
            System.out.println("4) On the human body, the area of skin known as â€œThe T-zoneâ€ is located where?");
            System.out.println("  A. Face");
            System.out.println("  B. Back");
            System.out.println("  C. Chest");
            System.out.println("  D. Hand");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("A")) {
                System.out.println("Correct!");
                System.out.println("You have won $750 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 5) {
            System.out.println("5) What keyboard symbolâ€™s name comes from a Greek word meaning â€œlittle starâ€?");
            System.out.println("  A. Ellipsis ...");
            System.out.println("  B. Asterisk *");
            System.out.println("  C. Ampersand &");
            System.out.println("  D. Hyphen -");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("B")) {
                System.out.println("Correct!");
                System.out.println("You have won $1,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }

        return answerType;
    }

    /**
     * The list of questions given in round two. They are given in the order shown using
     * if-statements and counters.
     *
     * @return String answerType - indicator of whether or not an answer was answered correctly. Gets returned to
     * class Millionaire_Game to determine if the game will continue running or not.
     */
    public String questionSet2() {
        count++;
        String answerType = "";
        if (count == 6) {
            System.out.println("6) Which of these countries remained officially neutral during both WWI and WWII?");
            System.out.println("  A. Austria");
            System.out.println("  B. Russia");
            System.out.println("  C. United States of America");
            System.out.println("  D. Sweden");
            System.out.println("What's your final answer?");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("D")) {
                System.out.println("Correct!");
                System.out.println("You have won $5,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 7) {
            System.out.println("7) Which of these common foods was unknown in Europe prior to the discovery of the New World?");
            System.out.println("  A. Potatoes");
            System.out.println("  B. Maize");
            System.out.println("  C. Squash");
            System.out.println("  D. Watermelons");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("A")) {
                System.out.println("Correct!");
                System.out.println("You have won $15,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 8) {
            System.out.println("8) Prized for their distinctive flavor, vanilla beans are the fruit of a rare type of what flower?");
            System.out.println("  A. Lillies");
            System.out.println("  B. Orchids");
            System.out.println("  C. Violets");
            System.out.println("  D. Petunias");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("B")) {
                System.out.println("Correct!");
                System.out.println("You have won $35,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 9) {
            System.out.println("9) Coined in recent years, the term â€œludologyâ€ often refers to the academic study of what?");
            System.out.println("  A. Video Games");
            System.out.println("  B. Human Body");
            System.out.println("  C. Comedy");
            System.out.println("  D. Ship Building");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("A")) {
                System.out.println("Correct!");
                System.out.println("You have won $75,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 10) {
            System.out.println("10) As Scar in â€œThe Lion King,â€ Jeremy Irons repeats what famous line from â€œReversal of Fortuneâ€?");
            System.out.println("  A. â€œI killed Mufasa.â€");
            System.out.println("  B. â€œSo prepare for the coup of the century.â€");
            System.out.println("  C. â€œYou have no idea.â€");
            System.out.println("  D. â€œI wouldn't dream of challenging you.â€");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("C")) {
                System.out.println("Correct!");
                System.out.println("You have won $100,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }

        return answerType;
    }

    /**
     * The list of questions given in round three. They are given in the order shown using
     * if-statements and counters.
     *
     * @return String answerType - indicator of whether or not an answer was answered correctly. Gets returned to
     * class Millionaire_Game to determine if the game will continue running or not.
     */
    public String questionSet3() {
        count++;
        String answerType = "";
        if (count == 11) {
            System.out.println("11) What state can boast that it has produced the most Miss America Pageant winners?");
            System.out.println("  A. Texas");
            System.out.println("  B. New York");
            System.out.println("  C. Mississippi");
            System.out.println("  D. California");
            System.out.println("What's your final answer?");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("A")) {
                System.out.println("Correct!");
                System.out.println("You have won $200,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 12) {
            System.out.println("12) Bluetooth, a wireless technology used to link mobile devices, is named for a former king of what country?");
            System.out.println("  A. Lithuania");
            System.out.println("  B. Denmark");
            System.out.println("  C. Norway");
            System.out.println("  D. Moldova");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("B")) {
                System.out.println("Correct!");
                System.out.println("You have won $350,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 13) {
            System.out.println("13) The capital letter-heavy album â€œNKOTBSBâ€ features 5 hits from New Kids On The Block and what other band?");
            System.out.println("  A. The Beach Boys");
            System.out.println("  B. The Beatles");
            System.out.println("  C. Bon Jovi");
            System.out.println("  D. The Backstreet Boys");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("D")) {
                System.out.println("Correct!");
                System.out.println("You have won $500,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 14) {
            System.out.println("14) Famously cited in â€œRomeo and Juliet,â€ which of these gestures was considered an insult in Elizabethan times?");
            System.out.println("  A. Punching someone");
            System.out.println("  B. Biting your thumb");
            System.out.println("  C. The OK hand gesture");
            System.out.println("  D. Giving a salute");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("B")) {
                System.out.println("Correct!");
                System.out.println("You have won $750,000 so far.");
                System.out.println("");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }
        else if (count == 15) {
            System.out.println("15) Which of these famous structures was completed most recently?");
            System.out.println("  A. The Eiffel Tower (Paris)");
            System.out.println("  B. The Pyramids (Egypt)");
            System.out.println("  C. Big Ben (England)");
            System.out.println("  D. The Royal Pavilion (England)");
            System.out.print("What's your final answer? ");
            letterSelection = answerScnr.next();
            if (letterSelection.equalsIgnoreCase("A")) {
                System.out.println("Correct!");
                answerType = "correct";
                return answerType;
            }
            else {
                answerType = "incorrect";
                return answerType;
            }
        }

        return answerType;
    }
}

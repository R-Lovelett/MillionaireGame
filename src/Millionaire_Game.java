import java.util.Scanner;
/**
 * This is a version of the famous game: Who Want To Be A Millionaire. It's a trivia game that awards you money
 * based on how many questions you answer correctly. Answering them all correctly earns you $1,000,000! (sort of).
 *
 * @author Randi Lovelett
 * @version 12/09/15
 */
public class Millionaire_Game
{
    Scanner scnr = new Scanner(System.in);
    Questions_List quizPlayer = new Questions_List(); //creates new object of class Questions_List.

    String startAnswer = ""; //answer user enters to start the game.
    String answer = "correct"; //indicates if a question was answered correctly or incorrectly.
    int questNumber = 1; //the question number the player is on.

    /**
     * Constructor for objects of class Millionaire_Game
     */
    public Millionaire_Game()
    {
        startGame(); //initialize the game
    }

    /**
     * Method startGame - This is the introduction of the game. Prints out the game title, the rules,
     * and asks the user if they want to play.
     */
    public void startGame() {
        System.out.println("Welcome to America's favorite quiz show:"); //The title and rules of the game.
        System.out.println("$$$$----$$$$----$$$$----$$$$----$$$$");
        System.out.println("    WHO WANTS TO BE A MILLIONAIRE");
        System.out.println("----$$$$----$$$$----$$$$----$$$$----");
        System.out.println("");
        System.out.println("The rules are simple:");
        System.out.println("> Answer the questions by entering the letter of the answer.");
        System.out.println("> Answer the questions correctly to earn cash.");
        System.out.println("> You can walk away with the cash you have at questions 3 and 6, but");
        System.out.println("  otherwise you must keep going.");
        System.out.println("> Answer all the questions correctly to win $1,000,000!");
        System.out.println("> Answer any of the questions wrong, and you lose all your winnings!");
        System.out.println("");

        System.out.println("Are you ready to play Who Wants to be a Millionaire? (yes or no)"); //Prompts the user to start the game.
        startAnswer = scnr.next();

        if (startAnswer.equalsIgnoreCase("yes")) {
            round1(); //If the user wants to play, initialize proceed to the set of questions for round 1.
        }
        else {
            System.out.println("Alright. Brush up on your knowledge and come back when you're ready."); //program ends if the user does not enter "yes".
        }
        return;
    }

    /**
     * Method round1 - The first set of questions for the game. There are 5 questions total.
     * Refers to the Questions_List object and asks questions through a loop.
     * Determines whether an answer is correct or incorrect. If incorrect, the loop is terminated and the game ends.
     * If correct, the loop continues until finished, where the next round begins.
     */
    public void round1() {
        System.out.println("");
        System.out.println("**** Round 1 ****");
        System.out.println("");
        while (questNumber <= 5) {
            //while the question number is less than or equal to five, run this set of questions.
            answer = quizPlayer.questionSet1(); //run the list of questions from class Questions_List and save the String it returns under String answer.
            if (answer.equals("incorrect")) {
                loseGame(); //end the game if the answer is incorrect.
                break;
            }
            questNumber++;
        }
        if (answer.equals("correct")) {
            //continue to the next round if the String answer equals "correct" after the loop increments 5 times.
            System.out.println("Congratulations! You have completed round 1!");
            System.out.println("Now if you answer a question wrong, you will still win $1,000.");
            System.out.println("");
            round2();
        }
        return;
    }

    /**
     * Method round2 - The second set of questions for the game. There are 5 questions total.
     * Refers to the Questions_List object and asks questions through a loop.
     * Determines whether an answer is correct or incorrect. If incorrect, the loop is terminated and the game ends.
     * If correct, the loop continues until finished, where the next round begins.
     */
    public void round2() {
        System.out.println("**** Round 2 ****");
        System.out.println("");
        while (questNumber <= 10) {
            //while the question number is greater than 5 and less than 10, run this set of questions.
            answer = quizPlayer.questionSet2(); //run this set of questions from class Question_List and save the String it returns under String answer.
            if (answer.equals("incorrect")) {
                loseGame2(); //end the game if the answer is incorrect.
                break;
            }
            questNumber++;
        }
        if (answer.equals("correct")) {
            //continue to the next round if the String answer equals "correct" after the loop increments 5 times.
            System.out.println("Congratulations! You have completed round 2!");
            System.out.println("Now if you answer a question wrong, you will still win $100,000.");
            System.out.println("");
            round3();
        }
        return;
    }

    /**
     * Method round3 - The last set of questions for the game. There are 5 questions total.
     * Refers to the Questions_List object and asks questions through a loop.
     * Determines whether an answer is correct or incorrect. If incorrect, the loop is terminated and the game ends.
     * If correct, the loop continues until finished, where the player then wins the game.
     */
    public void round3() {
        System.out.println("**** Round 3 ****");
        System.out.println("");
        while (questNumber <= 15) {
            //while the question number is greater than 10 and less than 15, run this set of questions.
            answer = quizPlayer.questionSet3(); //run this set of questions from class Question_List and save the String it returns under String answer.
            if (answer.equals("incorrect")) {
                loseGame3(); //end the game if the answer is incorrect.
                break;
            }
            questNumber++;
        }
        if (answer.equals("correct")) {
            winGame(); //if String answer still equals correct, even after all the questions have been asked, the use wins the game.
        }
        return;
    }

    /**
     * Method loseGame - the set of text that prints if the user answers a question wrong during round 1.
     * The user doesn't win any money.
     */
    public void loseGame() {
        System.out.println("Oh no! That's the wrong answer! You lost all your earnings!");
        System.out.println("Thank you for playing though! Better luck next time!");
    }

    /**
     * Method loseGame2 - the set of text that prints if the user answers a question wrong during round 2.
     * The user walks away with $1,000, the total amount of money that was earned from question 5.
     */
    public void loseGame2() {
        System.out.println("Oh no! That's the wrong answer! But at least you walk away with $1,000!");
        System.out.println("Thank you for playing!");
    }

    /**
     * Method loseGame3 - the set of text that prints if the user answers a question wrong during round 3.
     * The user walks away with $100,000, the total amount of money that was earned from question 10.
     */
    public void loseGame3() {
        System.out.println("Oh no! That's the wrong answer! But at least you walk away with $100,000!");
        System.out.println("Thank you for playing!");
    }

    /**
     * Method winGame - the set of text that prints if the user answers all the questions correctly
     *The user has won the game and the $1,000,000 cash prize!
     */
    public void winGame() {
        System.out.println("");
        System.out.println("----$$$$----CONGRATULATIONS!!----$$$$----");
        System.out.println("  You won Who Wants to be a Millionaire!");
        System.out.println("        You have won $1,000,000!");
        System.out.println("   $$$$----Thanks for playing!----$$$$");
    }

}

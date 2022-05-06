import java.util.Scanner;

public class chatBot {
    public static void main(String[] args) {

        System.out.println(greeting());
        System.out.println(name());
        System.out.println(age());
        System.out.println(number());
       question();
    }

    public static String greeting() {
        return "Hello there! My name is ChatBot 2.1.";
    }

    public static String name() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String word = input.nextLine();
        System.out.println("I'm sorry, I'm not a very smart bot. \n Can you tell me your name again?");
        String word2 = input.nextLine();
        return "Cool name! Nice to meet you " + word2 + "!";
    }

    public static String age() {
        Scanner input = new Scanner(System.in);
        System.out.println("I want to guess your age! I have a couple question though. \n " +
                "Are you legally able to drink alcohol in the US? (yes or no)");
        String word = input.nextLine();

        if (word.equalsIgnoreCase("yes")) {
            System.out.println("");
            for (int i = 21; i <= 100; i++) {
                int randAge = (int) (Math.random() * 100);
                System.out.println("Is your age " + randAge + "?");
                String ageAnswer = input.nextLine();
                if (ageAnswer.equalsIgnoreCase("Yes")) {
                    System.out.println("I am a good guesser!");
                    break;
                }
                }
            }

        else {
            System.out.println("Too young for this chat");
            System.exit(0);
        }


        return "Onto the next part!";
    }

    public static String number() {
        Scanner input = new Scanner(System.in);
        System.out.println("Speaking of numbers, pick any number you would like. \n " +
                "Don't pick to high of a number or else it will count for a while!");
        double num = input.nextDouble();
        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= num; i--) {
                System.out.println(i);
            }
        }
        return "I hope you liked me counting for you!";
    }

    public static void question() {
        Scanner input = new Scanner(System.in);
        System.out.println("Alright so now that we know your name and age, lets see if you have been paying attention to Hector.\n Answer the question below!");
        boolean answerInCorrect = true;
        while (answerInCorrect) {

            System.out.println("""
                    Which function is used to load the next URL in the history list?\s
                    A) window.history.forward();\s
                    B) window.history.next();\s
                    C) ctrl H\s
                    D) history.forward();""");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("B")) {
                System.out.println("Wrong! Guess again.");

            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("You really choose this answer?!");

            } else if (answer.equalsIgnoreCase("D")) {
                System.out.println("You need to learn more from Hector. Guess again!");

            } else  {
                System.out.println("Look at you! You learned something from Hector!");
                answerInCorrect = false;
            }
        }
    }
}

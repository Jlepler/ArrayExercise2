import java.util.Scanner;

public class ArrayExercise2 {
    public static void main(String [] args){

    Scanner key = new Scanner(System.in);

    Boolean continueProgram = true;
    do {
        System.out.println("\nWhich part of program would you like to run?" +
                "\n-------------------------------------\n" +
                "Part 1: Print a string in reverse\n" +
                "Part 2: Find a length of a string without using the library function\n" +
                "Part 3: Prompts user to input 10 values. Program will remove duplicates and print out remaining values\n" +
                "Part 4: Given two arrays, program will print all pairs that give a sum of 13.\n" +
                "Part 5: Prompts user to input 10 values. Program will print total number of odd and even values.\n" +
                "Part 6: End Program");

        System.out.print("Part: ");
        byte answer1 = key.nextByte();


        switch (answer1) {
            case 1:

                System.out.println("\n\nThis program prints the world 'Welcome' backwards.");
                String word1 = "Welcome";

                for (int i = (word1.length() - 1); i >= 0; i--) {
                    System.out.print(word1.charAt(i));
//            System.out.println(i);
//            System.out.println(word1.length());
                    if (i==0)
                    System.out.println("\n\n***End of Part 1 program***");
                }
                break;

            case 2:
                String userInput1 = key.next();

                for (int
                System.out.println("Case 2");
                break;

            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");
                break;
            case 5:
                System.out.println("Case 5");
                break;
            case 6:
                continueProgram = false;
                break;
        }

        } while (continueProgram);
    }
}

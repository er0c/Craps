/*
 * Eric Nguyen
 * 9/14/2022
 * CSE 007
 * Math Menu - prompts user with a menu and user can choose between the options to solve a math problem
 */

import java.util.Scanner;

public class MathMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum = 0; // null value

        // initlizaing menu with do loop to validate input
        do{
            System.out.println("\tWelcome to the Math Program");
            System.out.println("\t1. Addiiton");
            System.out.println("\t2. Substraction");
            System.out.println("\t3. Multiplcaiton");
            System.out.println("\t4. Division");
            userNum = input.nextInt();

        } while (userNum < 0  || userNum > 4); 


        //random number generator from 0-9 inclusive
        //initilizaing variables
        int ranNum = (int) (Math.random()*10);
        int ranNumTwo = (int) (Math.random()*10);
        int userAns = 0;
        int answer = 0;

        switch(userNum){
            //OPTION 1: Addiiotn Math Problem
            case 1:
            System.out.println("\nSolve " + ranNum + " + " + ranNumTwo + "\n");
            answer = ranNum + ranNumTwo;
            userAns = input.nextInt();

            if (userAns == answer) {
                System.out.println("\nCorrect!");
            } else {
                System.out.println("\nIncorrect!");
            }
            break;

            //Opiton 2: Substraction Math Problem
            case 2:
            System.out.println("\nSolve " + ranNum + " - " + ranNumTwo + "\n");
            answer = ranNum - ranNumTwo;
            userAns = input.nextInt();

            if (userAns == answer) {
                System.out.println("\nCorrect!");
            } else {
                System.out.println("\nIncorrect!");
            }
            break;

            //Option 3: Multiplcation Math Problem
            case 3:
            System.out.println("\nSolve " + ranNum + " * " + ranNumTwo + "\n");
            answer = ranNum * ranNumTwo;
            userAns = input.nextInt();

            if (userAns == answer) {
                System.out.println("\nCorrect!");
            } else {
                System.out.println("\nIncorrect!");
            }
            break;

            //Option 4: Diviosn Math Problem.
            case 4:
            System.out.println("\nSolve " + ranNum + " / " + ranNumTwo);
            System.out.println("Round Your Awnswer Down.\n");
            answer = ranNum / ranNumTwo;
            userAns = input.nextInt();

            if (userAns == answer) {
                System.out.println("\nCorrect!");
            } else {
                System.out.println("\nIncorrect!");
            }
            break; 
        }
    }
}
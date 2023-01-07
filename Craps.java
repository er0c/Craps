import java.util.Scanner;

public class Craps {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initializing null vars

        int dieOne = 0; 
        int dieTwo = 0;
        int userNum = 0;
        String slang = "";


        System.out.println("Hello, welcome to the Craps game");//we assume user knows how to play

        // prompt user with main menu
        do {
            System.out.println("\tCraps Main Menu");
            System.out.println("\t1. Randomly Generated Dice Rolls.");
            System.out.println("\t2. User-Provided Dice Rolls");
            userNum = input.nextInt();
        } while (userNum != 1 && userNum != 2);
        
        // functionality of main menu
        //assign dies with random result
        if (userNum == 1){
            dieOne = (int) (Math.random() * 6+1);
            dieTwo = (int) (Math.random() * 6+1);
        } else {
            // prompt user with their dice rolls.
            System.out.println("Please enter the value of your first dice roll. (1-6)");
            dieOne = input.nextInt();
            System.out.println("Please enter the value of your second dice roll. (1-6)");
            dieTwo = input.nextInt();
        }

        // sets dieOne to always be the smallest die roll.
        if (dieTwo < dieOne) {
            int tempDie = dieOne;
            dieOne = dieTwo;
            dieTwo = tempDie;
        }

        switch(dieOne){
            //when user rolls atleast one 1 out of the two dice rolls
            case 1: switch(dieTwo){
                // 1,1
                case 1:
                slang = "Snake Eyes";
                break;
                //1,2
                case 2:
                slang = "Ace Deuce";
                break;
                //1,3
                case 3:
                slang = "Easy Four";
                break;
                //1,4
                case 4:
                slang = "Fever Five";
                break;
                //1,5
                case 5:
                slang = "Easy Six";
                break;
                //1,6
                case 6:
                slang = "Seven Out";
                break;
            }
            break;

            //when user rolls atleast a 2 out of the two dice rolls
            case 2: switch(dieTwo){
                //2,2
                case 2: 
                slang = "Hard Four";
                break;
                //2,3
                case 3:
                slang = "Fever Five";
                break;
                //2,4
                case 4:
                slang = "Easy Six";
                break;
                //2,5
                case 5: 
                slang = "Seven Out";
                break;
                //2,6
                case 6:
                slang = "Easy Eight";
                break;
            }
            break;

            // When user rolls atleast one 3 out of the two dice rolls
            case 3: switch(dieTwo){
                //3,3
                case 3: 
                slang = "Hard Six";
                break;
                //3,4
                case 4:
                slang = "Seven Out";
                break;
                //3,5
                case 5:
                slang = "Easy Eight";
                break;
                //3,6
                case 6:
                slang = "Nine";
                break;
            }
            break;

            // When user rolls atleast one 4 out of the two dice rolls
            case 4: switch(dieTwo){
                //4,4
                case 4:
                slang = "Hard Eight";
                break;
                //4,5
                case 5:
                slang = "Nine";
                break;
                //4,6
                case 6:
                slang = "Easy Ten";
                break;
            }
            break;
            
            // when user rolls atleast one 5 out of the two dice rolls
            case 5: switch(dieTwo){
                //5,5
                case 5:
                slang = "Hard Ten";
                break;
                //5,6
                case 6:
                slang = "Yo-leven";
                break;
            }
            break;
            case 6: switch(dieTwo){
                //6,6
                case 6:
                slang = "Boxcards";
                break;
            }
            break;
        }

        // printing the results of rolled dice and slang
        System.out.println("\n\tYou rolled a " + dieOne +" and a " + dieTwo +"!");
        System.out.println("\tYou got " + slang + "!");
    }
}

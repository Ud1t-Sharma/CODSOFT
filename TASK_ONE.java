import java.util.Random;
import java.util.Scanner;
    class TASK_ONE{
        public static void main (String[]args){
            System.out.println("-------------------------------------------NUMBER GAME---------------------------------------------\n");
            Random rand = new Random();
            int rand1 = rand.nextInt(101);
            Scanner input = new Scanner(System.in);
            int s = 0;
            int[] Guesses = new int[111];
                System.out.println("ENTER 1 FOR YOUR FIRST GUESS");
                System.out.println("ENTER 2 FOR YOUR SECOND GUESS");
                System.out.println("ENTER 3 FOR YOUR THIRD GUESS");
                System.out.println("ENTER 4 TO QUIT");
                int userInput = input.nextInt();
             while(s != 0){
                if(userInput == 1){
                    System.out.println("PLEASE ENTER YOUR FIRST GUESS");
                    int Guess = input.nextInt();
                }
                else if(userInput == 2){
                    System.out.println("PLEASE ENTER YOUR Second GUESS");
                    int Guess1 = input.nextInt();
                }
                else if(userInput == 3){
                    System.out.println("PLEASE ENTER YOUR THIRD GUESS");
                    int Guess2 = input.nextInt();
                }
                if(userInput == 4){
                    System.exit(4);
                }
                else{
                    System.out.println("Error invalid input");
                }
            }
            System.out.println("Random Integer was:- " + rand1);
            if
            
        }
    }
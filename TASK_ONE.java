import java.util.Random;
import java.util.Scanner;
    class TASK_ONE
{
    private static void guessittowinit()
    {
            Scanner input = new Scanner(System.in);
            int num = 1 + (int)(100*Math.random());
            int chances = 3;
            int a, guess;
            
            System.out.println("-------------------------------GUESS THE NUMBER------------------------------");
            System.out.println("\nWE HAVE GENERATED A NUMBER AND YOU HAVE TO GUESS IS WITHIN 3 CHANCES TO WIN.");
            for(a=0;a<chances;a++)
            {
                System.out.println("GUESS THE NUMBER:-");
                guess = input.nextInt();
                if( num == guess)
                {
                    System.out.println("Congratulations!!! YOU GUESSED THE CORRECT NUMBER");
                    break;
                }
                else if (num > guess && a != guess - 1)
                {
                System.out.println("The number is greater than " + guess);
                }
                else if ( num < guess && a != chances - 1)
                {
                    System.out.println("The number is smaller than" + guess);
                }
                else {
                    System.out.println("The number was:-" + num);
                }
            }
        if (a == chances) 
        {
                    System.out.println("you are out of your chances");
        
                    System.out.println("The number was " + num);
        }
    }
    public static void main(String[]args){
        System.out.println("ENTER 1 TO START THE GAME");
        System.out.println("ENTER 2 TO EXIT");

        Scanner inn = new Scanner (System.in);
        int x , s = 0;
        x = inn.nextInt();

    
            if ( x == 1)
    {
        guessittowinit();
        
    }
     else if (x == 2)
     {
        System.exit(2);
     }
     else 
     {
        System.out.println("INVALID INPUT");
     }
    }
    
}
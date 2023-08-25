import java.util.Scanner;
import java.util.*;
class TASK_THREE
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        Double balance , withdraw , deposit , Account_number ,PIN , phone_number;
        String user_name;
        int user_one = 0 , new_deposit_bal = 0;
        phone_number = 000000000000 ;
        new_deposit_bal = 0;
        while (true)
        {
        System.out.println("ENTER 1 TO REGISTER NEW USER.");
        System.out.println("ENTER 2 TO DEPOSIT MONEY.");
        int x; 
        x =input.nextInt();
        if (x==1)
        {
            System.out.println("ENTER NAME OF THE ACCOUNT HOLDER :-");
            user_name = input.next();
            System.out.println("ENTER PHONE NUMBER OF THE ACCOUNT HOLDER :-");
            phone_number = input.nextDouble();
            phone_number += user_one;
            System.out.println("SET A PIN FOR YOUR ACCOUNT :-");
            PIN = input.nextDouble();
        }
        else if (x==2)
        {
            System.out.println("ENTER YOUR PHONE NUMBER.");
            if (phone_number == user_one) 
            {
                System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT.");
                deposit = input.nextDouble();
                deposit += new_deposit_bal;
            }
        }
        }
        
    }
}
import java.util.Scanner;
import java.util.Objects;

public class  TASK_THREE extends User_Account
{

    public void deposit(double amount)
    {
            balance += amount;
            System.out.println("AMMOUNT HAS BEEN DEPOSITED\nIT WILL REFLECT IN YOUR ACCOUNT WITHIN AN HOUR.");
    }

    public void Withdraw(double amount)
    {
            if(amount > balance) 
            {
                System.out.println("YOU DONT HAVE ENOUGH BALANCE IN YOUR BANK.");
            }
            else 
            {
                balance -= amount;
                System.out.println("WITHDRAWL APPROVED.\nREMOVE YOUR CARD.");
            }
    }
    

    public void checkBalance()
    {
        System.out.println("ACCOUNT BALANCE :- " + balance);
    }

    public static void main(String[] args) {

        TASK_THREE TASK_THREE = new TASK_THREE();

        double amount;
        int user_choice;
        String Account_Number , Account_Key;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the account number: ");
        Account_Number = scanner.nextLine();
        System.out.println("Input Pin: ");
        Account_Key = scanner.nextLine();

        while(Objects.equals(Account_Number, TASK_THREE.user_account) && Objects.equals(Account_Key,TASK_THREE.pin)) 
        {
            System.out.println("1.DEPOSIT\n2.WITHDRAW\n3.CHECK BALANCE\n4.EXIT");
            System.out.println("ENTER YOUR CHOICE:- ");
            user_choice = scanner.nextInt();

            switch (user_choice) 
            {
             case 1 -> 
             {
             System.out.println("Enter the amount: ");
             amount = scanner.nextDouble();
             TASK_THREE.deposit(amount);
             }
             case 2 -> 
             {
             System.out.println("Enter the Amount: ");
             amount = scanner.nextDouble();
             TASK_THREE.Withdraw(amount);
             }
             case 3 ->  TASK_THREE.checkBalance();
             case 4 ->  System.exit(0);
             default -> System.out.println("------------INVALID OPTION-----------\n--------TRY AGAIN---------");
             }
        }
    }
}
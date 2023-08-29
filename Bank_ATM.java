import java.util.Scanner;
import java.util.Objects;

public class  Bank_ATM extends User_Account
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

        Bank_ATM Bank_ATM = new Bank_ATM();

        double amount;
        int user_choice;
        String Account_Number , Account_Key;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account number: ");
        Account_Number = scanner.nextLine();
        System.out.println("Enter Pin: ");
        Account_Key = scanner.nextLine();

        while(Objects.equals(Account_Number, Bank_ATM.user_account) && Objects.equals(Account_Key,Bank_ATM.pin)) 
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
             Bank_ATM.deposit(amount);
             }
             case 2 -> 
             {
             System.out.println("Enter the Amount: ");
             amount = scanner.nextDouble();
             Bank_ATM.Withdraw(amount);
             }
             case 3 ->  Bank_ATM.checkBalance();
             case 4 ->  System.exit(0);
             default -> System.out.println("------------INVALID OPTION-----------\n--------TRY AGAIN---------");
             }
        }
    }
}
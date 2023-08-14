import java.util.Scanner;
class TASK_TWO
{
/*  {
    private static void subjects()
    {
        Scanner inn = new Scanner(System.in);
        int a ;
        a = inn.nextInt();
        System.out.println("TOTAL NUMBER OF SUBJECTS ARE "+a);
    }
 }*/
    public static void main(String[]args)
  { 
    System.out.println("---------------------------------------STUDENT GRADE CALCULATOR------------------------------------");
    System.out.println("PRESS 1 TO ENTER THE NUMBER OF YOUR SUBJECTS");
    System.out.println("PRESS 2 TO ENTER YOUR MARKS.");
    System.out.println("PRESS 3 TO CALCULATE TOTAL MARKS.");
    System.out.println("PRESS 4 TO CALCULATE AVERAGE PERCENTAGE.");
    System.out.println("PRESS 5 TO KNOW YOUR GRADE.");
    System.out.println("PRESS 6 TO DISPLAY YOUR MARKS, PERCENTAGE AND GRADE.");
    Scanner input = new Scanner(System.in);
    int x ;
    x = input.nextInt();
    if (x == 1)
    { System.out.println("PROVIDE THE INPUT:-");
      Scanner inn = new Scanner(System.in);
      int a ;
      a = inn.nextInt();
      System.out.println("TOTAL NUMBER OF SUBJECTS ARE "+a);

    }
  }
}
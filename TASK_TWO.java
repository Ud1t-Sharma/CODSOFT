import java.util.Scanner;
class TASK_TWO
{ 
  public static void main(String[]args)
  { System.out.println("---------------------------------PROVIDE BASIC DETAILS FOR THE WORKING OF PROGRAM----------------------------------------------------");
    Scanner input = new Scanner(System.in);
    int x , subject_no , total , max;
    double marks , percentage , total_marks = 0 ;
    System.out.println("ENTER TOTAL NUMBER OF SUBJECTS :- ");
    subject_no = input.nextInt();
    System.out.println("ENTER MAXIMUM MARKS THAT CAN BE OBTAINED IN EACH SUBJECT :- ");
    total = input.nextInt();
    max = subject_no*total;
    for(int i = 0 ; i < subject_no; i++){System.out.println("Marks of "+(i+1)+ ")  subject = ");marks = input.nextDouble();total_marks += marks;}
    percentage = total_marks / subject_no;
    int q = 0;
    while (q!=4)
    {
    System.out.println("---------------------------------------STUDENT GRADE CALCULATOR------------------------------------");
    System.out.println("PRESS 1 TO CALCULATE TOTAL MARKS.");
    System.out.println("PRESS 2 TO CALCULATE PERCENTAGE.");
    System.out.println("PRESS 3 TO KNOW YOUR GRADE.");
    System.out.println("PRESS 4 TO  QUIT");
    x = input.nextInt();
    if (x == 1)
    { 
      System.out.println("Total marks are = "+ total_marks +"out of "+max);
    }
    else if (x == 2)
    { 
      System.out.println("You have obtained "+ percentage +" percent.");
    }
    else if(x==3)
    { 
      if(percentage<100 && percentage>95){System.out.println("YOU HAVE SECURED A+ GRADE.");}
      else if (percentage<95 && percentage>90){System.out.println("YOU HAVE SECURED A GRADE.");}
      else if (percentage<90 && percentage>85){System.out.println("YOU HAVE SECURED A- GRADE.");}
      else if (percentage<85 && percentage>80){System.out.println("YOU HAVE SECURED B+ GRADE.");}
      else if (percentage<80 && percentage>75){System.out.println("YOU HAVE SECURED B GRADE.");}
      else if (percentage<75 && percentage>70){System.out.println("YOU HAVE SECURED B- GRADE.");}
      else if (percentage<70 && percentage>65){System.out.println("YOU HAVE SECURED C+ GRADE.");}
      else if (percentage<65 && percentage>60){System.out.println("YOU HAVE SECURED C GRADE.");}
      else if (percentage<60 && percentage>55){System.out.println("YOU HAVE SECURED C- GRADE.");}
      else if (percentage<55 && percentage>50){System.out.println("YOU HAVE SECURED D+ GRADE.");}
      else if (percentage<50 && percentage>45){System.out.println("YOU HAVE SECURED D GRADE.");}
      else if (percentage<45 && percentage>33){System.out.println("YOU HAVE SECURED D- GRADE.");}
      else if (percentage<33){System.out.println("YOU HAVE SECURED F GRADE.");}
    }
    else if(x==4)
    { 
      System.exit(4);
    }
    else 
    {
      System.out.println("============================INVALID ENTRY TRY AGAIN===========================");
    }
   }
  }
}
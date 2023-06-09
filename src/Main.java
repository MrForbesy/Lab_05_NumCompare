// class Comparison
//	main ()
//		num firstNum = 0
//		num secondNum = 0
//		output “Please input a number.”
//		input firstNum
//		output “Please input a second number.”
//		input secondNum
//		if firstNum != secondNum
//			if firstNum > secNum then
//				output secNum + “is the smallest number.”
//			else
//				output firstNum + “is the smallest number.”
//			endIf
//		else
//			output “Your numbers are equal.”
//		endIf
//	return
//end class
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        //Declaring my variables//
        Scanner in = new Scanner(System.in);
        int firstNum = 0;
        int secNum = 0;

        //Asking the users to input the first number and storing it in the correct variable.//
        System.out.printf("Please enter the first number.");
        firstNum = in.nextInt();

        //Asking the user to input the second number and storing it in the correct variable.//
        System.out.printf("Please enter the second number.");
        secNum = in.nextInt();

        //Comparing the two numbers and outputting which one is the smallest//
        if(firstNum != secNum)
        {
            if(firstNum>secNum)
            {
                System.out.printf(secNum + " is the smaller number.");
            }
            else
            {
                System.out.printf(firstNum + " is the smaller number.");
            }

        }
        //Letting the user know that the numbers are equal if they are the same.//
        else
        {
            System.out.printf("The numbers are equal.");
        }
    }
}
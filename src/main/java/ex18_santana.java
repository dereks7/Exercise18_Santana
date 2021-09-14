import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
C = (F − 32) × 5 / 9

F = (C × 9 / 5) + 32

Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.
 */


public class ex18_santana
{
    public static void main( String[] args ) {
        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" + "Press F to convert from Celsius to Fahrenheit.");
        System.out.println("Your choice: ");
        Scanner in1 = new Scanner(System.in);
        String choice = in1.nextLine();

        if (choice.equals("C")||choice.equals("c"))
        {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            Scanner in2 = new Scanner(System.in);
            String f = in2.nextLine();
            int n1 = Integer.parseInt(f);

            double cel = ((n1-32.0)*(5.0/9.0));

            System.out.println("The temperature in Celsius is "+ Math.round(cel*100.0)/100.0 +".");
        }
        else if (choice.equals("F")||choice.equals("f"))
        {
            System.out.println("Please enter the temperature in Celsius: ");
            Scanner in2 = new Scanner(System.in);
            String f = in2.nextLine();
            int n2 = Integer.parseInt(f);

            double far = ((n2*(9.0/5.0))+32.0);

            System.out.println("The temperature in Fahrenheit is "+ Math.round(far*100.0)/100.0 +".");
        }
    }
}

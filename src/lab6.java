import java.util.Scanner;
public class lab6 {
    public static void main (String[] args){

        int number1 = 0;
        int number2 = 0;
        int result = 0;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Number 1: ");
        number1 = scnr.nextInt();

        System.out.print("\nNumber 2: ");
        number2 = scnr.nextInt();

        result = number1 - number2;
        System.out.println("\nThe difference is: " + result);
    }

}

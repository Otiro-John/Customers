import java.util.*;
public class EvenOddNumbers {

/* Java Program to check whether entered number is EVEN or ODD */
    public static void main(String args[]) {

        //getting input from user using the scanner method
        Scanner sc = new Scanner(System.in);
        int num;

        //inpu
        System.out.print("Enter an integer number: ");
        num = sc.nextInt();

        //check EVEN or ODD
        if (num % 2 == 0) {
            System.out.println(num + " is an EVEN number.");
        } else {
            System.out.println(num + " is an ODD number.");
        }
    }

}

import java.util.*;

public class Average {
    public static void main(String[] args) {
int a , b, sum;
float average;

 Scanner buf = new Scanner(System.in);


System.out.println("Enter First Number:");
a = buf.nextInt();

System.out.println("Enter Second Number:");
b = buf.nextInt();

sum = a + b;
System.out.println("The sum of two numbers is:" + sum);

average = sum / 2;

System.out.println("The average of two numbers is:" + average);
    }
}

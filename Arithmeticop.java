// Take in two numbers and an operator (+, -, *, /) and calculate the value.
import java.util.Scanner;

public class Arithmeticop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter a number: ");
        int num2 = input.nextInt();
        double sum = num1 + num2;
        System.out.println("Sum of two numbers: " + sum);
        double difference = num1 - num2;
        System.out.println("Difference of two numbers: " + difference);
        double product = num1 * num2;
        System.out.println("Product of two numbers: " + product);
        double divison = num1 / num2;
        System.out.println("divison of two numbers: " + divison);

    }
}
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a principal: ");
        int principal = input.nextInt();
        System.out.print("Please enter a time: ");
        int time = input.nextInt();
        System.out.print("Please enter a rate: ");
        int rate = input.nextInt();
        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
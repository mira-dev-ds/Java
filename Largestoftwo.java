// Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Largestoftwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter a number: ");
        int num2 = input.nextInt();
        if (num1 > num2){
            System.out.println("Number 1 is the largest!");
        }else{
            System.out.println("Number 2 is the largest!");
        }

    }
}
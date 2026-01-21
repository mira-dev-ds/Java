//A program to print whether a number is even or odd by taking user Input

import java.util.Scanner;

public class Eod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = input.nextInt();
        if (a % 2 == 0){
            System.out.println("Number is even!");
        }else{
            System.out.println("Number is odd!");
        }
    }
}
//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int prev1 = 0;
        int prev2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int n = input.nextInt();
        System.out.print(prev1 + " ");
        System.out.print(prev2 + " ");
        for(int fibo = 0 ; fibo < n; fibo++){
            int newFibo = prev1 + prev2;
            System.out.print(newFibo + " ");
            prev1 = prev2;
            prev2 = newFibo;
        }

    }
}
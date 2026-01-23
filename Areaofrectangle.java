import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length value: ");
        float length = sc.nextFloat();
        System.out.println("Enter width value: ");
        float width = sc.nextFloat();
        double area = length * width;
        System.out.println("Area of Rectangle is: " + area);

    }
}
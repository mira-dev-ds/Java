import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        float radius = sc.nextFloat();
        float pi = 3.14f;
        float area = pi * (radius * radius);
        System.out.println("Area of circle is: " + area);

    }
}
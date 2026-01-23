import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value: ");
        float base = sc.nextFloat();
        System.out.println("Enter height value: ");
        float height = sc.nextFloat();
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle is: " + area);

    }
}
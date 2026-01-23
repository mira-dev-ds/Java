import java.util.Scanner;

public class Areaofparallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value: ");
        float base = sc.nextFloat();
        System.out.println("Enter height value: ");
        float height = sc.nextFloat();
        double area = base * height;
        System.out.println("Area of parallelogram is: " + area);

    }
}
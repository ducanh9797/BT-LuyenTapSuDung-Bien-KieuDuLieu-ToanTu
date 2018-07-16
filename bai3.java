import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập r: ");
        r = scanner.nextDouble();

        double Perimeter = r * 2 * Math.PI;
        System.out.println(Perimeter);

        double Area = r * r * Math.PI;
        System.out.println(Area);

    }
}

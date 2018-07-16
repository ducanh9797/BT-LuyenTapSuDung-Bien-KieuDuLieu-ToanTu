import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao x");
        x = scanner.nextInt();

        System.out.println("Nhap vao y ");
        y = scanner.nextInt();

        System.out.println("Nhap vao z");
        z = scanner.nextInt();

        double A = x + y + z;
        System.out.println(A);

        double B = (x + y + z) / 3;
        System.out.println(B);
    }
}

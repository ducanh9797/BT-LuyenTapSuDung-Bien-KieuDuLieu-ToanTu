import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        double r;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số năm hiện tại: ");
        r = scanner.nextDouble();

        System.out.println("Nhập số năm sinh: ");
        x = scanner.nextDouble();

        double age = r - x;
        System.out.println("Số tuổi" + age);

    }
}

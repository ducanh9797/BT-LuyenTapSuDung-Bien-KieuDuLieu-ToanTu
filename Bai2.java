import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        double celcius;
        double fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ celcius cần đổi: ");
        celcius = scanner.nextDouble();
        fahrenheit = (celcius / 5) * 9 + 32;

        System.out.println(celcius + "độ C= " + fahrenheit + "độ F");
        
    }
}

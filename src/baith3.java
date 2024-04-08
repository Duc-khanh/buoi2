import java.util.Scanner;

public class baith3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int ucln = timUocSoChungLonNhat(a, b);
        System.out.println("Ước số chung lớn nhất của " + a + " và " + b + " là: " + ucln);

        scanner.close();
    }

    public static int timUocSoChungLonNhat(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
}


import java.util.Scanner;

public class hienthicacloaihinh{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void printRectangle() {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void printSquareTriangle() {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }

    public static void printIsoscelesTriangle() {
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
    }
}


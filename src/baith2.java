import java.util.Scanner;
public class baith2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng tiền cho vay: ");
        double soTienVay = scanner.nextDouble();

        System.out.print("Nhập tỉ lệ lãi suất theo tháng (%): ");
        double laiSuatThang = scanner.nextDouble() / 100;

        System.out.print("Nhập số tháng cho vay: ");
        int soThangVay = scanner.nextInt();

        double tongTien = tinhTongTienVay(soTienVay, laiSuatThang, soThangVay);
        System.out.println("Tổng số tiền có được khi hết thời hạn cho vay là: " + tongTien);

        scanner.close();
    }

    public static double tinhTongTienVay(double soTienVay, double laiSuatThang, int soThangVay) {
        double tongTien = soTienVay;
        for (int i = 0; i < soThangVay; i++) {
            tongTien += tongTien * laiSuatThang;
        }
        return tongTien;
    }
}


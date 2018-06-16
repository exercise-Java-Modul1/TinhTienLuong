import java.util.Scanner;

public class TinhTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Hệ số lương của bạn là: ");
            double He_so_luong = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập vào số năm làm việc: ");
            int Nam_lam_viec = Integer.parseInt(sc.nextLine());

            if (He_so_luong <= 5 && He_so_luong >= 1) {
                double TienLuong = He_so_luong * 4000000 + Nam_lam_viec * 500000;
                System.out.println("Tiền lương của bạn là: " + TienLuong);

            } else {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại!");
            }
            System.out.println( );
            System.out.println("----------------------------------------------");
            System.out.println( );
        }
    }
}

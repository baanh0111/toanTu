import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       float chieuDai, chieuRong;

       Scanner scanner = new Scanner(System.in);
       System.out.print("Nhap chieu rong: ");
       chieuRong = scanner.nextFloat();
       System.out.print("Nhap chieu dai: ");
       chieuDai = scanner.nextFloat();
       System.out.println("Dien tich hinh chu nhat la:  " + (chieuRong * chieuDai));



    }
}

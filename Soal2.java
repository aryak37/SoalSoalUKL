import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");

        if (!sc.hasNextInt()) {
            System.out.println("Input tidak valid: masukkan bilangan bulat.");
            sc.close();
            return;
        }

        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " adalah bilangan genap.");
        } else {
            System.out.println(n + " adalah bilangan ganjil.");
        }

        sc.close();
    }
}
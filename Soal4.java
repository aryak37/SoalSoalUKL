import java.util.Scanner;

public class Soal4 {
    public static double volumeTabung(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari (r): ");
        double r = sc.nextDouble();
        System.out.print("Masukkan tinggi (t): ");
        double t = sc.nextDouble();
        sc.close();

        if (r < 0 || t < 0) {
            System.out.println("Jari-jari dan tinggi harus bernilai >= 0");
            return;
        }

        double volume = volumeTabung(r, t);
        System.out.printf("Volume tabung = %.4f%n", volume);
    }
}
import java.util.Scanner;
import java.math.BigInteger;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat non-negatif: ");
        try {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
            } else {
                BigInteger faktorial = BigInteger.ONE;
                for (int i = 2; i <= n; i++) {
                    faktorial = faktorial.multiply(BigInteger.valueOf(i));
                }
                System.out.println(n + "! = " + faktorial);
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Masukkan bilangan bulat.");
        } finally {
            sc.close();
        }
    }
}
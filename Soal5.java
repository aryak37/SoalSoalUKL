import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        
        double totalNilai = 0;
        
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }
        
        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("\nHasil Rekapitulasi:");
        System.out.println("Jumlah siswa: " + jumlahSiswa);
        System.out.println("Total nilai: " + totalNilai);
        System.out.printf("Rata-rata nilai: %.2f", rataRata);
        
        input.close();
    }
}
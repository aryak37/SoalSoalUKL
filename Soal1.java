import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double beratKg = 0.0;
        double jarakKm = 0.0;
        double panjang = 0.0;
        double lebar = 0.0;
        double tinggi = 0.0;

        if (args.length == 5) {
            try {
                beratKg = Double.parseDouble(args[0]);
                jarakKm = Double.parseDouble(args[1]);
                panjang = Double.parseDouble(args[2]);
                lebar = Double.parseDouble(args[3]);
                tinggi = Double.parseDouble(args[4]);
            } catch (NumberFormatException e) {
                System.out.println("Argumen tidak valid. Akan meminta input interaktif.");
            }
        }

        if (args.length != 5) {
            System.out.print("Masukkan berat paket (kg): ");
            while (!sc.hasNextDouble()) { sc.next(); System.out.print("Masukkan angka untuk berat (kg): "); }
            beratKg = sc.nextDouble();

            System.out.print("Masukkan jarak tempuh (km): ");
            while (!sc.hasNextDouble()) { sc.next(); System.out.print("Masukkan angka untuk jarak (km): "); }
            jarakKm = sc.nextDouble();

            System.out.print("Masukkan panjang paket (cm): ");
            while (!sc.hasNextDouble()) { sc.next(); System.out.print("Masukkan angka untuk panjang (cm): "); }
            panjang = sc.nextDouble();

            System.out.print("Masukkan lebar paket (cm): ");
            while (!sc.hasNextDouble()) { sc.next(); System.out.print("Masukkan angka untuk lebar (cm): "); }
            lebar = sc.nextDouble();

            System.out.print("Masukkan tinggi paket (cm): ");
            while (!sc.hasNextDouble()) { sc.next(); System.out.print("Masukkan angka untuk tinggi (cm): "); }
            tinggi = sc.nextDouble();
        }

        double volume = panjang * lebar * tinggi;

        int tarifPerKg = (jarakKm <= 10.0) ? 4250 : 6000;

        double biayaBerat = beratKg * tarifPerKg;

        double biayaVolume = (volume > 100.0) ? 50000.0 : 0.0;

        double total = biayaBerat + biayaVolume;

        NumberFormat nf = NumberFormat.getIntegerInstance(new Locale("id", "ID"));
        long biayaBeratRounded = Math.round(biayaBerat);
        long biayaVolumeRounded = Math.round(biayaVolume);
        long totalRounded = Math.round(total);

        System.out.println();
        System.out.println("---- Rincian Biaya Pengiriman ----");
        System.out.println("Berat paket: " + beratKg + " kg");
        System.out.println("Jarak tempuh: " + jarakKm + " km");
        System.out.println(String.format("Tarif per kg: Rp %s", nf.format(tarifPerKg)));
        System.out.println(String.format("Biaya berat: Rp %s", nf.format(biayaBeratRounded)));
        System.out.println(String.format("Volume paket: %.2f cm^3", volume));
        if (biayaVolumeRounded > 0) {
            System.out.println(String.format("Biaya tambahan volume (>100 cm^3): Rp %s", nf.format(biayaVolumeRounded)));
        } else {
            System.out.println("Biaya tambahan volume: Rp 0 (volume <= 100 cm^3)");
        }
        System.out.println(String.format("Total biaya pengiriman: Rp %s", nf.format(totalRounded)));
        System.out.println("----------------------------------");

        sc.close();
    }
}
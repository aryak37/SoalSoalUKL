import java.util.Scanner;

public class Soal6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan jumlah baris: ");
		if (!sc.hasNextInt()) {
			System.out.println("Input tidak valid: baris harus bilangan bulat positif.");
			sc.close();
			return;
		}
		int rows = sc.nextInt();

		System.out.print("Masukkan jumlah kolom: ");
		if (!sc.hasNextInt()) {
			System.out.println("Input tidak valid: kolom harus bilangan bulat positif.");
			sc.close();
			return;
		}
		int cols = sc.nextInt();

		if (rows <= 0 || cols <= 0) {
			System.out.println("Ukuran matriks harus bernilai positif.");
			sc.close();
			return;
		}

		int[][] a = new int[rows][cols];
		int[][] b = new int[rows][cols];

		System.out.println("Masukkan elemen matriks pertama (" + rows + "x" + cols + "):");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (!sc.hasNextInt()) {
					System.out.println("Input tidak valid: dibutuhkan " + (rows * cols) + " bilangan untuk matriks pertama.");
					sc.close();
					return;
				}
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Masukkan elemen matriks kedua (" + rows + "x" + cols + "):");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (!sc.hasNextInt()) {
					System.out.println("Input tidak valid: dibutuhkan " + (rows * cols) + " bilangan untuk matriks kedua.");
					sc.close();
					return;
				}
				b[i][j] = sc.nextInt();
			}
		}

		int[][] sum = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("Hasil penjumlahan matriks:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(sum[i][j]);
				if (j < cols - 1) System.out.print(" ");
			}
			System.out.println();
		}

		sc.close();
	}
}


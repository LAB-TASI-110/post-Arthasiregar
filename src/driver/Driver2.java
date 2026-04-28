package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1. Jumlah data
        System.out.print("Masukkan jumlah data (N): ");
        int N = input.nextInt();

        int[] stok = new int[N];

        // 2. Input stok
        System.out.println("Masukkan data stok:");
        for (int i = 0; i < N; i++) {
            System.out.print("Stok ke-" + (i + 1) + ": ");
            stok[i] = input.nextInt();
        }

        // 3. Input kategori
        System.out.print("Masukkan kategori (0=genap, 1=ganjil): ");
        int kategori = input.nextInt();

        // Proses pakai Model2
        Model2 model = new Model2();
        int total = model.hitungTotalKategori(stok, kategori);

        // Output
        System.out.println("Total stok kategori " + kategori + " = " + total);

        input.close();
    }
}
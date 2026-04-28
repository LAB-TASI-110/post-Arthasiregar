package driver;

import java.util.Scanner;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model3 model = new Model3();

        System.out.println("=== KAFETERIA IT DEL ===");

        // Input jumlah item
        System.out.print("Masukkan jumlah jenis makanan/minuman: ");
        int n = Integer.parseInt(input.nextLine());

        String[] nama = new String[n];
        int[] harga = new int[n];
        int[] jumlah = new int[n];

        // Input data
        for (int i = 0; i < n; i++) {
            System.out.print("Nama item ke-" + (i+1) + ": ");
            nama[i] = input.nextLine();

            System.out.print("Harga: ");
            harga[i] = Integer.parseInt(input.nextLine());

            System.out.print("Jumlah: ");
            jumlah[i] = Integer.parseInt(input.nextLine());
        }

        // Hitung
        int total = model.hitungTotal(harga, jumlah);
        double diskon = model.hitungDiskon(total);
        double totalSetelahDiskon = total - diskon;
        double pajak = model.hitungPajak((int) totalSetelahDiskon);
        double totalAkhir = model.hitungTotalAkhir(total, diskon, pajak);

        // Metode pembayaran
        System.out.print("Metode pembayaran (Cash / QRIS): ");
        String metode = input.nextLine();

        // Output
        System.out.println("\n=== STRUK PEMESANAN ===");
        for (int i = 0; i < n; i++) {
            System.out.println(nama[i] + " x" + jumlah[i] + " = " + (harga[i] * jumlah[i]));
        }

        System.out.println("------------------------");
        System.out.println("Total       : " + total);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Pajak (10%) : " + pajak);
        System.out.println("Total Akhir : " + totalAkhir);
        System.out.println("Pembayaran  : " + metode);
        System.out.println("Status      : " + model.statusPesanan());

        input.close();
    }
}
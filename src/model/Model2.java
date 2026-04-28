package model;

public class Model2 {

    // Method untuk menghitung total stok berdasarkan kategori
    public int hitungTotalKategori(int[] stok, int kategori) {
        int total = 0;

        for (int i = 0; i < stok.length; i++) {

            // Contoh aturan kategori:
            // kategori 0 = index genap
            // kategori 1 = index ganjil
            if (kategori == 0 && i % 2 == 0) {
                total += stok[i];
            } else if (kategori == 1 && i % 2 != 0) {
                total += stok[i];
            }

        }

        return total;
    }
}
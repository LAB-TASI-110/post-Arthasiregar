package model;

public class Model3 {

    // Hitung total harga
    public int hitungTotal(int[] harga, int[] jumlah) {
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += harga[i] * jumlah[i];
        }
        return total;
    }

    // Hitung diskon 5% jika > 50000
    public double hitungDiskon(int total) {
        if (total > 50000) {
            return total * 0.05;
        }
        return 0;
    }

    // Pajak 10%
    public double hitungPajak(int totalSetelahDiskon) {
        return totalSetelahDiskon * 0.10;
    }

    // Total akhir
    public double hitungTotalAkhir(int total, double diskon, double pajak) {
        return total - diskon + pajak;
    }

    // Status pesanan
    public String statusPesanan() {
        return "Pesanan sedang diproses...";
    }
}
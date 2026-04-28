package model;

public class Model1 {

    // Nama kota
    public String getNamaKota(String kode) {
        switch (kode) {
            case "MDN": return "Medan";
            case "BLG": return "Balige";
            case "JKT": return "Jakarta";
            case "SBY": return "Surabaya";
            default: return "Tidak diketahui";
        }
    }

    // Ongkir per kg
    public int getOngkir(String kode) {
        switch (kode) {
            case "MDN": return 8000;
            case "BLG": return 5000;
            case "JKT": return 12000;
            case "SBY": return 13000;
            default: return 0;
        }
    }

    // Keterangan pulau
    public String getKeterangan(String kode) {
        switch (kode) {
            case "MDN":
            case "BLG":
                return "Dalam Pulau";
            case "JKT":
            case "SBY":
                return "Luar Pulau";
            default:
                return "-";
        }
    }

    // Hitung berat Ucok
    public double hitungBeratUcok(double beratButet) {
        return (3.0 / 2.0) * beratButet;
    }

    // Hitung total berat
    public double hitungTotalBerat(double butet, double ucok) {
        return butet + ucok;
    }

    // Hitung total ongkir
    public double hitungOngkir(double totalBerat, int ongkirPerKg) {
        return totalBerat * ongkirPerKg;
    }

    // Hitung promo & final ongkir
    public double hitungDiskon(double totalBerat, double totalOngkir) {
        if (totalBerat > 10) {
            return totalOngkir * 0.9;
        }
        return totalOngkir;
    }

    // Info promo
    public String getPromo(double totalBerat, String keterangan) {
        String promo = "";

        if (totalBerat > 10) {
            promo += "Diskon 10% ";
        }

        if (keterangan.equals("Luar Pulau")) {
            promo += "Asuransi Gratis";
        }

        if (promo.equals("")) {
            return "Tidak ada promo";
        }

        return promo;
    }
}
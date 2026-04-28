package driver;

import java.util.Scanner;
import model.Model1;

public class Driver1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Model1 model = new Model1();

        while (true) {
            String kode = input.nextLine();

            if (kode.equals("END")) {
                break;
            }

            double beratButet = input.nextDouble();
            input.nextLine(); // buang newline

            // Ambil data dari model
            String namaKota = model.getNamaKota(kode);
            int ongkirPerKg = model.getOngkir(kode);
            String keterangan = model.getKeterangan(kode);

            double beratUcok = model.hitungBeratUcok(beratButet);
            double totalBerat = model.hitungTotalBerat(beratButet, beratUcok);
            double totalOngkir = model.hitungOngkir(totalBerat, ongkirPerKg);

            // Diskon
            totalOngkir = model.hitungDiskon(totalBerat, totalOngkir);

            String promo = model.getPromo(totalBerat, keterangan);

            // Output
            System.out.println("=== Struk Pembayaran ===");
            System.out.println("Kota Tujuan       : " + namaKota);
            System.out.println("Berat Butet       : " + beratButet + " kg");
            System.out.println("Berat Ucok        : " + beratUcok + " kg");
            System.out.println("Total Berat       : " + totalBerat + " kg");
            System.out.println("Total Ongkir      : Rp " + (int) totalOngkir);
            System.out.println("Promo             : " + promo);
            System.out.println();
        }

        input.close();
    }
}
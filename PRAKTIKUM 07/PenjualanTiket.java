import java.util.Scanner;
public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000, totalTiketTerjual = 0, totalHargaPenjualan = 0;
        double diskon;

        while (true) {
            System.out.println("Masukkan jumlah tiket yang dibeli (atau ketik 0 untuk keluar): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silakan masukkan ulang.");
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            } else {
                diskon = 0; 
            }
            int hargaSetelahDiskon = (int) (hargaTiket * jumlahTiket * (1 - diskon));
            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += hargaSetelahDiskon;

            System.out.println("Harga setelah diskon: Rp " + hargaSetelahDiskon);
        }

        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total harga penjualan tiket hari ini: Rp " + totalHargaPenjualan);
    }
}

import java.util.Scanner;
public class KafeDoWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalharga;
        String namapelanggan;
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = sc.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("jumlah roti: ");
            roti = sc.nextInt();

            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total yang harus dibayarkan: Rp " + totalharga);
            sc.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}

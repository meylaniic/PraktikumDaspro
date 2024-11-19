import java.util.Scanner;

public class oit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        // Meminta input menu
        System.out.println("Masukkan menu : ");
        menu = sc.nextLine();

        // Meminta input ukuran cup dengan validasi
        while (true) {
            System.out.println("Masukkan ukuran cup (S/M/L): ");
            ukuranCup = sc.next().charAt(0);
            ukuranCup = Character.toUpperCase(ukuranCup); // Konversi ke huruf besar
            if (ukuranCup == 'S' || ukuranCup == 'M' || ukuranCup == 'L') {
                break; // Keluar dari loop jika input valid
            } else {
                System.out.println("Ukuran cup tidak valid. Silakan coba lagi.");
            }
        }

        // Meminta input jumlah
        System.out.println("Masukkan jumlah : ");
        jumlah = sc.nextInt();

        // Meminta input keanggotaan
        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        double totalHarga = hargaMenu * jumlah;

        // Menambahkan harga berdasarkan ukuran cup
        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian : " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar: " + nominalBayar);

        sc.close();
    }
}

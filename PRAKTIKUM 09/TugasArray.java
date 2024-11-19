import java.util.Scanner;
public class TugasArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] daftarmenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
       double [] daftarharga = {20000, 22000, 15000, 17000, 13000, 18000, 20000};

       System.out.println("Selamat datang di kedai MANTAP, Silahkan pilih menu yang anda inginkan");
       System.out.println("Daftar menu & Price List: ");
       System.out.println("1. Nasi Goreng = Rp 20.000"); 
       System.out.println("2. Mie Goreng Rp 22.000");
       System.out.println("3. Roti Bakar Rp 15.000");
       System.out.println("4. Kentang Goreng Rp 17.000");
       System.out.println("5. Teh tarik Rp 13.000"); 
       System.out.println("6. Cappucino Rp 18.000");
       System.out.println("7. Chocolate Ice Rp 20.000");



       int[] daftarPesanan = new int[daftarmenu.length];
        
        String pilihMenu;
        int jumlahPesanan;
        double totalHarga = 0;

        while (true) {
            System.out.print("Masukkan nama menu (atau ketik 'selesai' untuk menyelesaikan pesanan): ");
            pilihMenu = sc.nextLine();

            if (pilihMenu.equalsIgnoreCase("selesai")) {
                break;
            }

            int indeksMenu = -1;
            for (int i = 0; i < daftarmenu.length; i++) {
                if (daftarmenu[i].equalsIgnoreCase(pilihMenu)) {
                    indeksMenu = i;
                    break;
                }
            }

            if (indeksMenu != -1) {
                System.out.print("Masukkan jumlah pesanan untuk " + pilihMenu + ": ");
                jumlahPesanan = sc.nextInt();
                sc.nextLine(); 

                daftarPesanan[indeksMenu] += jumlahPesanan;

                totalHarga += daftarharga[indeksMenu] * jumlahPesanan;

                System.out.println("Pesanan " + pilihMenu + " sebanyak " + jumlahPesanan + " berhasil ditambahkan.");
            } else {
                System.out.println("Menu yang Anda pilih tidak tersedia. Silakan pilih menu lain.");
            }
        }

        System.out.println("=== Daftar Pesanan Anda ===");
        for (int i = 0; i < daftarmenu.length; i++) {
            if (daftarPesanan[i] > 0) {
                System.out.println(daftarmenu[i] + " x " + daftarPesanan[i] + " = " + (daftarharga[i] * daftarPesanan[i]));
            }
        }
        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
        System.out.println("TERIMA KASIH  TELAH MAMPIR DI KEDAI MANTAP");
        
        sc.close();
    }
}


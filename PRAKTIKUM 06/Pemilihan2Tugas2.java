import java.util.Scanner;
public class Pemilihan2Tugas2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String jenisbuku, hari;
        int jumlahbuku;
        double diskon = 0;

        System.out.println("Hari apa sekarang : ");
        hari = sc.nextLine();
        System.out.println("Masukkan jenis buku yang dibeli :");
        jenisbuku = sc.nextLine();
        System.out.println("Masukkan jumlah buku : ");
        jumlahbuku = sc.nextInt();

        if (hari.trim().equalsIgnoreCase("Rabu")) {
            if (jenisbuku.trim().equalsIgnoreCase("Kamus")) {
                diskon = 0.1;

                if (jumlahbuku > 2) {
                    diskon += 0.02;
                }
 
            } else if (jenisbuku.trim().equalsIgnoreCase("Novel")) {
                diskon = 0.07;
                if (jumlahbuku > 3) {
                    diskon += 0.02;
                } else {
                    diskon += 0.01;
                }
                
        }
    } else {
                if (jumlahbuku > 3) {
                    diskon = 0.05;
                }

        }
        System.out.println("Jumlah diskon anda : " + String.format( "%.2f", diskon ));
    }
}
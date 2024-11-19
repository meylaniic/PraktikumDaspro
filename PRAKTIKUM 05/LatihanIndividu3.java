import java.util.Scanner;
public class LatihanIndividu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jeniskendaraan;

        System.out.print("Masukkan jenis kendaraan yang akan diparkir (mobil/motor) ");
        jeniskendaraan = sc.nextLine();

        if (jeniskendaraan.equalsIgnoreCase("Motor")) {
            System.out.println("Biaya parkir anda selama 1 jam yaitu Rp.3000");
        }
        else if (jeniskendaraan.equalsIgnoreCase("Mobil")) {
            System.out.println("Biaya parkir anda selama 1 jam yaitu Rp.5000");
        }
        else {
            System.out.println("Jenis kendaraan tidak valid");
        }
    }
}

import java.util.Scanner;
public class Siakadfor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100, bataslulus = 60.0;
        int lulus = 0, tidaklulus = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai > bataslulus) {
                lulus++;
                System.out.print("nilai mahasiswa ke " + i);
                System.out.println(" diatas batas lulus");
            } else {
                tidaklulus++;
                System.out.print("nilai mahasiswa ke " + i);
                System.out.println(" dibawah batas lulus");
            }
            
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah:" + terendah);
        System.out.println("jumlah mahasiswa lulus adalah : " + lulus);
        System.out.println("jumlah mahasiswa tidak lulus adalah : " + tidaklulus);
    }
}
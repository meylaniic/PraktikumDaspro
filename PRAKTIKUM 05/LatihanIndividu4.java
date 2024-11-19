import java.util.Scanner;

public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umur;

        System.out.print("Masukkan umur Anda: ");
        umur = sc.nextInt();

        if (umur >= 0 && umur <= 12) {
            System.out.println("Usia anda termasuk ke dalam kategori Anak.");
        } 
        else if (umur >= 13 && umur <= 19) {
            System.out.println("Usia anda termasuk ke dalam kategori Remaja.");
        } 
        else if (umur >= 20 && umur <= 64) {
            System.out.println("Usia anda termasuk ke dalam kategori Dewasa.");
        } 
        else if (umur >= 65) {
            System.out.println("Usia anda termasuk ke dalam kategori Lansia.");
        } 
        else {
            System.out.println("Umur tidak valid.");
        }
    }
}

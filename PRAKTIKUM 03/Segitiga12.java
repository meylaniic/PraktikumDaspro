import java.util.Scanner;
public class Segitiga12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan Tinggi: ");
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;
        System.out.print("Luas Segitiga : " + luas);
        
    }
}

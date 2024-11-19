import java.util.Scanner;
public class tenaryoperatorpemilihanbil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}

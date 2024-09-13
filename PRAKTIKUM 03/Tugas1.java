import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifListrik, penggunaanListrik, tagihan, listrikLebih;

        listrikLebih = 500;
        tarifListrik = 1500;

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): Rp. " );
        penggunaanListrik = sc.nextInt();

        tagihan = penggunaanListrik * tarifListrik;
        System.out.println("Berikut merupakan tagihan listrik anda : " + tagihan);

        System.out.println("Apakah listrik lebih dari 500kWh?: " + (listrikLebih < penggunaanListrik));


    
    }
    

}

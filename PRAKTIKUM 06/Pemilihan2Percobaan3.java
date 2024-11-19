import java.util.Scanner;
public class Pemilihan2Percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kategori;
        int penghasilan, gajibersih;
        double pajak = 0;

        System.out.println("Masukkan Kategori : ");
        kategori = sc.nextLine();
        System.out.println("Masukkan besar penghasilan");
        penghasilan = sc.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            }else if (penghasilan <= 3000000){
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajibersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            }else if (penghasilan <= 3500000) {
                pajak = 0.15;
            } else {
                pajak = 0.25;
            }
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil bersih : " + gajibersih);
            } else {
                System.out.println("Masukkan kategori salah");
    }
        }

    }

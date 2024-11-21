import java.util.Scanner;
public class Tugas10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int [][] survey = new int [6][10];

        System.out.print("Masukkan jumlah pertanyaan : ");
        int jumlahpertanyaan = sc.nextInt();
        System.out.print("Masukkan jumlah responden : ");
        int jumlahresponden = sc.nextInt();
        int [][] nilai = new int[jumlahpertanyaan][jumlahresponden];
        double totalseluruh =0;

        for (int i = 0; i < jumlahpertanyaan; i++) {
            System.out.println("Input nilai responden untuk pertanyaan ke : " + (i+1) + (" (pilih nilai 1 - 5)"));
            double nilaipertanyaan = 0;

            for (int j = 0; j < jumlahresponden; j++) {
                System.out.print("Nilai responden ke-" + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                nilaipertanyaan += nilai[i][j];
                totalseluruh += nilai[i][j];
            }
            System.out.println("Nilai rata-rata pertanyaan ke-" + (i+1) + " adalah : " + (nilaipertanyaan/jumlahresponden));
        }

        System.out.println("Rata rata nilai setiap responden : ");
        for (int j = 0; j < jumlahresponden; j++) {
            double totalperresponden = 0;

            for (int i = 0; i < jumlahpertanyaan; i++) {
                totalperresponden += nilai[i][j];
            }
            System.out.println("Responden ke-" + (j+1) + " : " + (totalperresponden/jumlahpertanyaan));
        }
        //System.out.println("Rata-rata seluruhnya adalah : ");
        double rataseluruh = totalseluruh / (jumlahpertanyaan*jumlahresponden);
        System.out.println("Rata rata seluruhnya adalah : " + rataseluruh);

    }
}

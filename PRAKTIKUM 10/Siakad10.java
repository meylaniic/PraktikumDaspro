import java.util.Scanner;
public class Siakad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int [][] nilai = new int[4][3];

        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlahmahasiswa = sc.nextInt();
        System.out.println("Masukkan jumlah mata kuliah : ");
        int jumlahmatkul = sc.nextInt();

        int [][] nilai = new int[jumlahmahasiswa][jumlahmatkul];

        for (int i = 0; i < jumlahmahasiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i +1));
            double totalpersiswa = 0;

            for (int j = 0; j < jumlahmatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai [i][j] = sc.nextInt();
                totalpersiswa += nilai [i][j];
            }
            System.out.println("Nilai rata-rata mahasiswa ke- " + (i+1) + ": " + (totalpersiswa/jumlahmatkul));
        }
        for (int j = 0; j < jumlahmatkul; j++) {
            double totalpermatkul = 0;
            for (int i = 0; i < jumlahmahasiswa; i++) {
                totalpermatkul += nilai [i][j];
            }
            System.out.println("Rata-rata nilai Mata Kuliah " + (j + 1) + ": " + totalpermatkul / jumlahmahasiswa);
        }
    }
}

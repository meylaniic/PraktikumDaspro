import java.util.Scanner;
public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahmhs = sc.nextInt();

        int[] nilaiMhs = new int [jumlahmhs];
        double totalulus = 0, totaltdklulus = 0;
        double ratalulus= 0, ratatdklulus= 0;
        int mhslulus = 0, mhstdklulus = 0;
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalulus += nilaiMhs[i];
                mhslulus++;
            } else {
                totaltdklulus += nilaiMhs[i];
                mhstdklulus++;
            }

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        ratalulus= totalulus/mhslulus;
        ratatdklulus = totaltdklulus/mhstdklulus;
        System.out.println("Rata-rata nilai mahasiswa lulus = " + ratalulus);
        System.out.println("Rata-rata nilai mahasiswa tidak lulus = " + ratatdklulus);
        System.out.println("Jumlah mahasiswa lulus adalah : " + mhslulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + mhstdklulus);
        System.out.println("Nilai tertinggi adalah : " + tertinggi);
        System.out.println("Nilai terendah adalah : " + terendah);


        
    }
}

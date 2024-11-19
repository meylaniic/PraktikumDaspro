import java.util.Scanner;
public class Ratanilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaimhs;
        double totalnilai, ratanilai;
        int i=1;
        while (i<=5) {
            totalnilai=0;
            System.out.println("Input Nilai Mahasiswa ke- " + i);
            for (int j = 1; j <= 5; j++) {
                //System.out.println("Input Nilai Mahasiswa ke- " + i);
                System.out.print("Nilai ke-" + j + " = ");
                nilaimhs=sc.nextInt();
                totalnilai += nilaimhs;
            }
            ratanilai=totalnilai/5;
            System.out.println("Rata rata Nilai Mahasiswa ke- " + i + " adalah " + ratanilai);
            i++;
        }
    }
}

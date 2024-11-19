import java.util.Scanner;
public class SearchNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan di input : ");
        int banyaknilai =  sc.nextInt();

        int [] arrNilai = new int[banyaknilai];

        System.out.println("Masukkan nilai ke dalam array : ");
        for (int i = 0; i < banyaknilai; i++) {
            System.out.print("Nilai Mahasiswa ke- " + (i + 1) + " :");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();

        int hasil = -1 ;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + "ketemu, merupakan nilai mahasiswa ke-" + (hasil+1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}

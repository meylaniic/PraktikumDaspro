import java.util.Scanner;
public class Pemilihan2Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3;

        System.out.println("Masukkan bil 1 = ");
        bil1 = sc.nextInt();
        System.out.println("Masukkan bilangan 2 = ");
        bil2 = sc.nextInt();
        System.out.println("Masukkan bilangan 3 = ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar adalah bilangan 1 : ");
            } else {
                System.out.println("Bilangan terbesar adalah bilangan 3 : ");
            }
        } else if (bil2 > bil3) {
            System.out.println("Bilangan terbesar adalah bilangan 2");
        } else {
            System.out.println("Bilangan terbesar adalah bilangan 3");
        }
    }
}

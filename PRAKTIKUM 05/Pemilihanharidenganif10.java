import java.util.Scanner;
public class Pemilihanharidenganif10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.println("Input number around 1-7 : ");
        angka = sc.nextInt();

        if (angka >= 1 && angka <= 5 ) {
            System.out.println("Today is a weekday");
        }
        else if (angka >= 6 && angka <= 7) {
            System.out.println("Today is a weekend");

        }
        else {
            System.out.println("Invalid number");
        }
    }
}

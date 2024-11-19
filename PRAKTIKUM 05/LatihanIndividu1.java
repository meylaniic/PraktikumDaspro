import java.util.Scanner;
public class LatihanIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lampu;

        System.out.println("Apa warna lampu sekarang? (Merah/Kuning/Hijau) ");
        lampu = sc.nextLine();

        if (lampu.equalsIgnoreCase("Hijau")) {
            System.out.println("Lampu " + lampu + " Silahkan Jalan");
        }
        else if (lampu.equalsIgnoreCase("Kuning")) {
            System.out.println("Lampu " + lampu + " Harap berhati hati");
        }
        else if (lampu.equalsIgnoreCase("Merah")) {
            System.out.println("Lampu " + lampu + " Harap untuk berhenti");
        }
        else {
            System.out.println("Input tidak valid");
        }
    
    }   
}

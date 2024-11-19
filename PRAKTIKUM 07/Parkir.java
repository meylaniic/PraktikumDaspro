import java.util.Scanner;
public class Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        
        while (true) {
            System.out.println("Masukkan jenis kendaraan (1 = mobil | 2 = motor | 0 = keluar)");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            } 

            if (jenis < 0 || jenis > 2) {
                System.out.println("Input tidak valid, silahkan input ulang : ");
                continue;
            }

            System.out.println("Masukkan durasi parkir (dalam jam) : ");
            durasi = sc.nextInt();
            
            if (durasi <= 0) {
                System.out.println("Durasi tidak valid, silahkan input ulang");
                continue;
            }
            if (jenis == 1) {
                int biaya = 0;
                if (durasi > 5) {
                    biaya += 12500;
                } else {
                    biaya += (durasi * 3000);
                }
                System.out.println("total bayar parkir mobil adalah : " + biaya);
                total += biaya;
            }
            if (jenis == 2) {
                int biaya = 0;
                if (durasi > 5) {
                    biaya += 12500;
                } else {
                    biaya += (durasi * 2000);
                }
                System.out.println("total bayar parkir motor adalah : " + biaya);
                total += biaya;
            }
            }
        System.out.println("total pendapatan parkir : " + total);
        }
    }


import java.util.Scanner;
public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihanmenu, harga;
        double diskon,totalbayar;
        String member, pilihanpembayaran;
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanmenu = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("-------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanmenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihanmenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            }else if (pilihanmenu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " +harga);
            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            totalbayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalbayar);
            //System.out.println("Masukkan pilihan pembayaran anda (qris/cash) : ");
            // pilihanpembayaran = sc.nextLine();
               // if (pilihanpembayaran.equalsIgnoreCase("qris")) {
                //  diskon =-1000;
                 //System.out.println("Selamat anda mendapatkan potongan sebesar Rp 1.000 ");
                //System.out.println("Total bayar anda adalah : " + (totalbayar + diskon));
                //} else {
                 //   System.out.println("total bayar anda = " + totalbayar );
                }
           // }
       
                
        else if (member.equalsIgnoreCase("n")) {
            if (pilihanmenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihanmenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            }else if (pilihanmenu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling = " +harga);
            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
        System.out.println("Masukkan pilihan pembayaran anda (qris/cash) : ");
        pilihanpembayaran = sc.nextLine();
        if (pilihanpembayaran.equalsIgnoreCase("qris")) {
                diskon =- 1000; 
                System.out.println("Selamat anda mendapatkan potongan harga Rp 1.000 !");
                System.out.println("Total bayar anda = " + (harga + diskon));
        } else {
            System.out.println("Total bayar anda = " + harga);
        }
        } else {
            System.out.println("member tidak valid");
        }
        System.out.println("---------------------");
            }
            
        }



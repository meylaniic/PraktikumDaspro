import java.util.Scanner;
public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;

        String [][] penonton = new String[4][2];

        //while (true) {
        //    System.out.print("Masukkan nama : ");
        //   nama = sc.nextLine();
        //    System.out.print("Masukkan baris : ");
        //   baris = sc.nextInt();
        //    System.out.print("Masukkan kolom : ");
        //    kolom = sc.nextInt();
        //    sc.nextLine();

        //   penonton[baris-1][kolom-1] = nama;
        //    System.out.print("Input nama penonton lainnya? (y/n) : ");
        //    next = sc.nextLine();

        //    if (next.equalsIgnoreCase("n")) {
        //        break;
        //    }

        while (true) {
            System.out.println("Selamat datang di XXI, silahkan pilih menu dibawah ini :");
            System.out.println("1. Input data penonton : ");
            System.out.println("2. Tampilkan daftar penonton : ");
            System.out.println("3. Exit ");
            System.out.println("Input menu yang anda ingin kan (1/2/3)");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.println("Masukkan nama : ");
                nama = sc.nextLine();
                System.out.println("Masukkan baris : ");
                baris = sc.nextInt();
                System.out.println("Masukkan kolom : ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    // Cek apakah kursi sudah terisi
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan.");
                    } else {
                        System.out.println("Seat ini sudah terisi, Silahkan input ulang baris dan kolom yang tersedia");
                    }
                } else {
                    System.out.println("Posisi baris atau kolom tidak valid!");
                }

            } else if (pilihan == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris ke-" + (i + 1) + ", Kolom ke-" + (j + 1) + " : ***");
                        } else {
                            System.out.println("Baris ke-" + (i + 1) + ", Kolom ke-" + (j + 1) + " : " + penonton[i][j]);
                        }
                    }
                }

            } else if (pilihan == 3) {
                System.out.println("Terima kasih, program selesai.");
                sc.close();
                break;

            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
import java.util.Scanner;

import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        SingleLinkedList06 sll = new SingleLinkedList06();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nInput Data Mahasiswa");
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("IPK: ");
                    double ipk = input.nextDouble();
                    input.nextLine();

                    Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
                    sll.addLast(mhs);
                    System.out.println("Mahasiswa " + nama + " berhasil ditambahkan");
                    break;

                case 2:
                    System.out.println("\nData Mahasiswa:");
                    sll.print();
                    break;

                case 0:
                    System.out.println("\nTerima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
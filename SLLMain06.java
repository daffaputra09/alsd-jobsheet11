import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SingleLinkedList06 sll = new SingleLinkedList06();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); 
    
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
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
        }
        sll.print();
    }
}
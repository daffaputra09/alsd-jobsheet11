public class Mahasiswa06 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa06() {
    }

    public Mahasiswa06(String nim, String nama, String kls, double ip) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("%-15s%-15s%-10s%.1f\n", nama, nim, kelas, ipk);
    }
}
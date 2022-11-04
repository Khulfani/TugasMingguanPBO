import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Membuat Scanner untuk class Petugas
        Petugas pgs = new Petugas();
        Scanner Petugas = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println(" ### PETUGAS RENTAL PS ### ");
        System.out.println(" Nama Petugas : ");
        pgs.nama_petugas = Petugas.nextLine();
        // Tampilkan output lagi
        System.out.println(" No Hp : ");
        pgs.no_hp = Petugas.nextLine();
        System.out.println(" Alamat : ");
        pgs.alamat = Petugas.nextLine();

        // Membuat Scanner untuk class Penyewa
        Penyewa in = new Penyewa();
        Scanner Penyewa = new Scanner(System.in);
        System.out.println(" ### PENDATAAN PENYEWA ### ");
        System.out.println(" Nama Penyewa : ");
        in.nama_penyewa = Penyewa.nextLine();
        System.out.println(" No Hp : ");
        in.no_hp = Penyewa.nextLine();
        System.out.println(" Alamat : ");
        in.alamat = Penyewa.nextLine();

        // Menampilkan data yang sudah di inputkan
        System.out.println("---------------------------");
        System.out.println(" Nama Petugas : " +pgs.getNama_petugas());
        System.out.println(" No Hp : " +pgs.getNo_hp());
        System.out.println(" Alamat : "+pgs.getAlamat());

        System.out.println("--------------------------");
        System.out.println(" Nama Penyewa : " +in.getNama_penyewa());
        System.out.println(" No Hp : " +in.getNo_hp());
        System.out.println(" Alamat : " +in.getAlamat());

        RentalSewa rs = new RentalSewa("1");
        Scanner RentalSewa = new Scanner(System.in);
        RentalSewa cek = new RentalKeluar("1");
        RentalKeluar rk = new RentalKeluar("1");
        Scanner RentalKeluar = new Scanner(System.in);
        cek.Jenis_PS();
        System.out.println(" Pilih Kode PS yang ingin di Sewa : ");
        System.out.println(" Jenis PS yang anda pilih : "+cek.getKode_sewa());
    }
}
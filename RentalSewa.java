public class RentalSewa {
    String kode_sewa;

    public int Biaya(int harga, int lama_sewa) {
        System.out.println("-");
        return 0;
    }
    public void Jenis_PS(){
        System.out.println(" Jenis PS yang anda Sewa");
    }


    public RentalSewa(String kode_sewa) {
        this.kode_sewa = kode_sewa;
    }

    public String getKode_sewa() {
        return kode_sewa;
    }

    public void setKode_sewa(String kode_sewa) {
        this.kode_sewa = kode_sewa;
    }

}

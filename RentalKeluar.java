public class RentalKeluar extends RentalSewa {
    int harga;
    int lama_sewa;

    public RentalKeluar(String kode_sewa) {
        super(kode_sewa);
    }

    @Override
    public void Jenis_PS(){
        System.out.println(" 1. PS 3, 30000/hari");
        System.out.println(" 2. PS 4, 60000/hari");
        System.out.println(" 3. PS 5, 80000/hari");
    }
    @Override
    public int Biaya(int harga, int lama_sewa){
        return harga*lama_sewa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getLama_sewa() {
        return lama_sewa;
    }

    public void setLama_sewa(int lama_sewa) {
        this.lama_sewa = lama_sewa;
    }
}

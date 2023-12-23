package Entity;

public class DetilPemesanan {
    private String idDetilpemesanan;
    private Pemesanan pemesanan;
    private Langganan Langganan;
    private int hargaJual;
    private int jumlahBeli;
    private int subTotal;
    private Tutor tutor;

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }
    public int getHargaJual() {
        return hargaJual;
    }


    public String getIdDetilPemesanan() {
        return idDetilpemesanan;
    }
    public void setIdDetilPemesanan(String idDetilpemesanan) {
        this.idDetilpemesanan = idDetilpemesanan;
    }

    public void setpemesanan(Pemesanan pemesanan) {
    this.pemesanan = pemesanan;
    }
    public Pemesanan getpemesanan() {
        return pemesanan;
    }

    public Langganan getLangganan() {
        return Langganan;
    }
    public void setLangganan(Langganan Langganan) {
        this.Langganan = Langganan;
    }


    public int getJumlahBeli() {
        return jumlahBeli;
    }
    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public int getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public Tutor getTutor() {
    return tutor;
    }
    public DetilPemesanan setTutor(Tutor tutor) {
    this.tutor = tutor;
    return this;
    }
}

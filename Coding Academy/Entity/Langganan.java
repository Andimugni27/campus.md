package Entity;
public class Langganan {
    private String idlangganan;
    private String PaketLangganan;
    private int hargaLangganan;
    private Tutor Tutor;
    private int Kuota;
    private int waktu;
    
    public Langganan setIdLangganan(String idlangganan){
        this.idlangganan = idlangganan;
        return this;
    }
    public String getIdLangganan() {
        return idlangganan;
    }

    public Langganan setNameLangganan(String PaketLangganan){
        this.PaketLangganan = PaketLangganan;
        return this;
    }
    public Langganan setHargaLangganan(int hargaLangganan){
        this.hargaLangganan = hargaLangganan;
        return this;
    }

    public Tutor getTutor() {
    return Tutor;
    }

    public Langganan setTutor(Tutor Tutor) {
    this.Tutor = Tutor;
    return this;
    }

    public String getnamaLangganan() {
        return PaketLangganan;
    }

    public int getHargaLangganan() {
        return hargaLangganan;
    }

    public Langganan setKuota(int Stok){
        this.Kuota = Stok;
        return this;
    }
    public int getKuota(){
        return Kuota;
    }

    public Langganan setWaktu(int Waktu){
        this.waktu = Waktu;
        return this;
    }    
    public int getWaktu(){
        return waktu;
    }
    
}

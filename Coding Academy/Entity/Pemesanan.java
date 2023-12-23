package Entity;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pemesanan {
    private String idPemesanan;
    private User user;
    private Tutor Tutor;
    private int total;
    private LocalDate tanggal;
    private ArrayList<DetilPemesanan> detilPemesanans;
    private String metodePembayaran;
    private int waktu;

    public Pemesanan setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
        return this;
    }
    public String getIdPemesanan() {
    return idPemesanan;
    }

    public Pemesanan setUser(User pembeli) {
        this.user = pembeli;
        return this;
    }
    public User getUser() {
        return user;
    }


    public Tutor getTutor() {
        return Tutor;
    }
    public Pemesanan setTutor(Tutor tutor) {
        this.Tutor = tutor;
        return this;
    }

    public int getTotal() {
        return total;
    }
    public Pemesanan setTotal(int total) {
        this.total = total;
        return this;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }
    public Pemesanan setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public ArrayList<DetilPemesanan> getDetilPemesanans() {
        return detilPemesanans;
    }
    public Pemesanan setDetilPemesanans(ArrayList<DetilPemesanan> detilPemesanans) {
        this.detilPemesanans = detilPemesanans;
        return this;
    }
    public Pemesanan setWaktu(int waktu) {
        this.waktu = waktu;
        return this;
    }


    public Pemesanan setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
        return this;
    }
    public String getMetodePembayaran() {
        return metodePembayaran;
    }
    public int getWaktu() {
        return waktu;
    }
}

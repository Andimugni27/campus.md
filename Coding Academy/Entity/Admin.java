package Entity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.text.NumberFormat;
import java.util.Locale;

public class Admin {
    HashMap<String, Langganan> Langganans = new HashMap<>();
    ArrayList<Pemesanan> Pemesanans = new ArrayList<>();
    HashMap<String, User> Users = new HashMap<>();
    HashMap<String, Tutor> tutors = new HashMap<>();
    
    public void setUp() {
    setup.initializeData(Langganans, Users, tutors);

    User pembeli01 = new User();
    pembeli01.setIdUser("01").setBank(10000000).setEmoney(5000000);
    Users.put(pembeli01.getIdUser(), pembeli01);
    }
    
    public Langganan getLangganan(String idlangganan) {
        return Langganans.get(idlangganan);
    }

    public Tutor getTutor(String idTutor) {
        return tutors.get(idTutor);
    }

    public User getUser(String idUser) {
        return Users.get(idUser);
    }

    public void lihatDaftarlangganan() {
        System.out.println();
        System.out.println("==== Daftar Langganan Coding Learning ====");
        
        for (Map.Entry<String, Langganan> Langganan : Langganans.entrySet()) {
            String key = Langganan.getKey();
            Langganan tLangganan = Langganan.getValue();
                System.out.println("Kode langganan \t :" + key);
                System.out.println("Tutor \t \t : " + tLangganan.getTutor().getName());
                System.out.println("Paket \t\t :" + tLangganan.getnamaLangganan());
                System.out.println("Kuota \t \t : " + tLangganan.getKuota());
                System.out.println("Harga \t\t :" + formatUang(tLangganan.getHargaLangganan()));
                System.out.println();
        }
    }

    public void about(){
        String ab = ("Coding Academy adalah situs belajar online berbasis website yang bikin kamu jadi suhu programmer");
        ab += "\nKami menyediakan lebih dari 4000 video untuk kamu pelajari loh..";
        ab += ("\nBukan hanya itu saja, kamu bakalan ditemani oleh tutor kamu yang sudah ahli dalan pemogramaan, salah satunya CEO dari Startup One Piece yaitu Luffy Ph.D");
        ab += ("\nWaw banget kan!?");
        ab += ("\nBuruan berlanggan di Coding Academy");
        ab += ("\nKuota Terbatas Lohh...");
        ab += ("\nSalam Printer!");
        ab += ("\n@Coding_Academy");
        System.out.println(ab);
    }
// =================================================================================================
// Friz

    public void tampilkanDaftarPemesanan(ArrayList<DetilPemesanan> rt) {
        for (DetilPemesanan detilPemesanan : rt) {
            System.out.println("Nama Tutor \t :" + detilPemesanan.getTutor().getName());
            System.out.println("Nama langganan \t :" + detilPemesanan.getLangganan().getnamaLangganan());
            System.out.println("Harga \t :" + formatUang(detilPemesanan.getHargaJual())); 
            System.out.println("");
        }
    }

public void pemesanan() {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<DetilPemesanan> tDetilPemesanans = new ArrayList<>();
    int increment = 0;

    try {
            increment++;
            System.out.println();
            System.out.println("Bank Anda: " + formatUang(getUser("01").getBank()));
            System.out.println("eMoney Anda : " + formatUang(getUser("01").getEmoney()));
            while (true) {
            System.out.print("Silahkan masukkan kode langganan\t: ");
            String kodeLangganan = input.readLine();
                Langganan tLangganan = getLangganan(kodeLangganan);

                if (tLangganan.getKuota() > 0) {
                    DetilPemesanan rt = new DetilPemesanan();
                    rt.setIdDetilPemesanan("rt" + increment);
                    rt.setLangganan(tLangganan);
                    rt.setHargaJual(tLangganan.getHargaLangganan());
                    rt.setSubTotal(tLangganan.getHargaLangganan());
                    rt.setTutor(tLangganan.getTutor());

                    tDetilPemesanans.add(rt);

                    break;
                } else {
                    System.out.println("Mohon Maaf!\nKuota Sudah tidak Mencukupi");
                }
            }

        System.out.println("");
        System.out.println("=== Berikut Daftar Langganan Anda ===");
        System.out.println("Saldo Bank Anda: " + formatUang(getUser("01").getBank()));
        System.out.println("eMoney Anda: " + formatUang(getUser("01").getEmoney()));
        tampilkanDaftarPemesanan(tDetilPemesanans);
        System.out.println("TOTAL: " + formatUang(hitungTotalPesanan(tDetilPemesanans)));
        BufferedReader inputMetodePembayaran = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pilih Metode Pembayaran (Bank/emoney): ");
        String metodePembayaran = inputMetodePembayaran.readLine();

        BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Konfirmasi pembelian (Y/N)?");
        String konfirmasi = inputKonfirmasi.readLine();

        if (konfirmasi.equalsIgnoreCase("y")) {
            Pemesanan Pemesanan = new Pemesanan();
            Pemesanan.setDetilPemesanans(tDetilPemesanans)
            .setIdPemesanan("#00" + Pemesanans.size() + 1)
            .setUser(getUser("01"))
            .setTutor(getTutor("02"))
            .setTanggal(LocalDate.now())
            .setTotal(hitungTotalPesanan(tDetilPemesanans))
            .setMetodePembayaran(metodePembayaran)
            .setWaktu(tDetilPemesanans.get(0).getLangganan().getWaktu()); 
            Pemesanans.add(Pemesanan);
        }

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

// =================================================================

    public int hitungTotalPesanan(ArrayList<DetilPemesanan> rt) {
            int total = 0;
        for (DetilPemesanan detilPemesanan : rt) {//foreach loop
            total += detilPemesanan.getSubTotal();//total = total + detilPemesanan.getSubTotal()
        }
            return total;
    }

    public void tampilkanLaporanPemesanan(String email, String nama) {
        ArrayList<DetilPemesanan> tDetilPemesanans = new ArrayList<>();
        int totalPesanan = hitungTotalPesanan(tDetilPemesanans);

//localdate, arraylist, numberformat, locale

        for (Pemesanan i : Pemesanans) {
            System.out.println();
            System.out.println("========================================================================");
            System.out.println("========================== PAKET-BELAJAR-ANDA ==========================");
            System.out.println("========================================================================");
            System.out.println("Kode Pemesanan \t :" + i.getIdPemesanan());
            System.out.println("Tanggal Dimulai \t :" + i.getTanggal());
            System.out.println("Tanggal Berakhir\t :" + i.getTanggal().plusDays(i.getWaktu()));
            System.out.println("Alamat Email \t \t :" + email);
            System.out.println("Nama    \t\t:"+nama);
            System.out.println("=========================");
            ArrayList<DetilPemesanan> detilPemesanans = i.getDetilPemesanans();

    
            for (DetilPemesanan rt : detilPemesanans) {
                System.out.println("Nama Langganan \t \t : " + rt.getLangganan().getnamaLangganan());
                System.out.println("Tutor \t\t\t : " + rt.getTutor().getName());
                System.out.println("Harga \t\t\t : " + formatUang(rt.getHargaJual())); 
                System.out.println("Metode Pembayaran \t: " + i.getMetodePembayaran());
            }
            System.out.println("=========================");
            System.out.println("Total \t \t : " + formatUang(i.getTotal()));  
    
            int uangBank = getUser("01").getBank();
            int emoney = getUser("01").getEmoney();

            System.out.println("Uang User (Bank)\t: " + formatUang(uangBank));
            System.out.println("Uang User (eMoney)\t: " + formatUang(emoney));

            if (i.getMetodePembayaran().equalsIgnoreCase("Bank") && uangBank >= totalPesanan) {
                int kembalianBank = uangBank - i.getTotal();
                System.out.println("Kembalian (Saldo Bank): " + formatUang(kembalianBank));
            } else if (i.getMetodePembayaran().equalsIgnoreCase("emoney") && emoney >= totalPesanan) {
                int kembalianEmoney = emoney - i.getTotal();
                System.out.println("Kembalian (eMoney): " + formatUang(kembalianEmoney));
            } else {
                System.out.println("Pembayaran tidak mencukupi");
            }
            
            System.out.println("========================================================================");
            System.out.println("========== Terima-Kasih-Sudah-Berlangganan-di-Coding-Academy ===========");
            System.out.println("========================================================================");
        }
    }
    private String formatUang(int digit) {
        NumberFormat nomorFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nomorFormat.format(digit);
    }
    //di dalan kelas admin
    }

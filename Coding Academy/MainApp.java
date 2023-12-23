
import java.io.BufferedReader;
import java.io.InputStreamReader;
import Entity.Admin;

public class MainApp {

    public static void main(String[] args) throws Exception {

        BufferedReader inputEmail = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan alamat email Anda: ");
        String email = inputEmail.readLine();

        BufferedReader inputPassword = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan kata sandi email Anda: ");
        String password = inputPassword.readLine();

        BufferedReader inputNama = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nama depan anda: ");
        String nama = inputNama.readLine();

        String p = "////////////////////////////////";
        p += "\nSelamat Datang di Coding Academy";
        p += "\n////////////////////////////////";
        p += "\nDi bawah ini silahkan pilih paket belajar yang sesuai dengan kamu";
        p += "\nSelamat Belajar";
        System.out.print(p);
        
        Admin admin = new Admin();
        admin.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (lanjut) {
            tampilkanMenu();
            System.out.print("Masukkan Kode :");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    admin.lihatDaftarlangganan();
                    admin.pemesanan();
                    admin.tampilkanLaporanPemesanan(email,nama);
                    lanjut = false;
                    break;
                    default:
                case "2":
                    admin.about();          
                    break;
            }
        }
    }
    public static void tampilkanMenu() {
        System.out.println("\n1. Lihat Paket Belajar");
        System.out.println("2. About");
    }
}
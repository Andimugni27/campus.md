#include <iostream>
#include <iomanip>
#include <vector>
#include <limits> // Untuk numeric_limits

using namespace std;

class Bioskop {
public:
    //Deklarasi kursi dan tanda baris menggunakan prinsip array 1/2 dimensi dan prinsip vector
    int seat[9][15];
    char baris[9] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
    vector<string> SeatBooking; // Menyimpan kursi yang telah dipesan atau seperti arraylist/hashmap

    Bioskop() /*konstruktor*/ {
        // Inisialisasi kursi dengan nilai 1 (tersedia)
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 15; j++) {
                seat[i][j] = 1;
            }
        }
    }

    void tampilkanKursi() {
        // Menampilkan layar bioskop
        cout << "\t           LAYAR BIOSKOP           " << endl;
        cout << "\t-----------------------------------" << endl << endl;

        // Menampilkan kursi dengan label baris
        for (int i = 0; i < 9; i++) {
            cout << baris[i] << "  "; // Menampilkan label baris
            for (int j = 0; j < 15; j++) {
                cout << setw(2) << seat[i][j] << " ";
            }
            cout << endl;
        }

        //masuk barisan akhir
        // Menampilkan nomor kolom
        cout << "   "; // Spasi untuk mencocokkan kolom dengan nomor baris
        for (int j = 1; j <= 15; j++) {
            cout << setw(2) << j << " ";
        }
        cout << endl;
    }

    bool setSeat(char baris, int kolom) {
        int barisIndex = -1;
        // Membandingkan input baris dengan huruf besar dan kecil
        for (int i = 0; i < 9; i++) {
            if (this->baris[i] == baris || 
                (this->baris[i] == 'A' && baris == 'a') || 
                (this->baris[i] == 'B' && baris == 'b') || 
                (this->baris[i] == 'C' && baris == 'c') || 
                (this->baris[i] == 'D' && baris == 'd') || 
                (this->baris[i] == 'E' && baris == 'e') || 
                (this->baris[i] == 'F' && baris == 'f') || 
                (this->baris[i] == 'G' && baris == 'g') || 
                (this->baris[i] == 'H' && baris == 'h') || 
                (this->baris[i] == 'I' && baris == 'i')) {
                barisIndex = i;
                break;
            }
        }
        if (barisIndex != -1 && kolom >= 1 && kolom <= 15 && seat[barisIndex][kolom - 1] == 1) {
            seat[barisIndex][kolom - 1] = 0; // Mengubah kursi menjadi tidak tersedia
            SeatBooking.push_back(string(1, this->baris[barisIndex]) + to_string(kolom)); // Menyimpan kursi yang dipesan
            return true;
        } else {
            cout << "Kursi tidak tersedia atau input tidak valid!" << endl;
            return false;
        }
    }

    void tampilkanStruk(int biaya) {
        cout << "====================\nSTRUK PEMESANAN\n====================\n";
        cout << "Seat yang dipesan : ";
        for (const auto& seat : SeatBooking) {
            cout << seat << " ";
        }
        cout << endl;
        cout << "Harga total : " << biaya << " Rupiah" << endl << endl;
    }
};

int main() {
    cout << "Selamat Datang di Reservasi Bioskop Gold Screen!!!" << endl;
    bool mulai = true;
    int biaya = 0;

    Bioskop bioskop; // Membuat instance dari kelas Bioskop

    //perulangan while jika mulai benar
    while (mulai) {
        cout << "Silahkan pilih film yang ingin anda tonton!" << endl;
        cout << "1. Spider-man: BrokenHome\n2. One Piece: Shipuden (Coming Soon)\n3. Exit" << endl;
        cout << "Pilihan: ";

        int pilihMenu;
        cin >> pilihMenu;

        if (cin.fail()) {
            cout << "Input tidak valid, silakan coba lagi." << endl;
            cin.clear(); // Membersihkan state error
            cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Mengabaikan input yang salah
            continue; // Kembali ke awal loop
        }

        switch (pilihMenu) {
        case 1: {
            bool pilihseat = true;
            //perulangan pilihseat
            do {
                bioskop.tampilkanKursi(); // Memanggil metode tampilkanKursi untuk menampilkan pengaturan kursi
                char baris;
                int kolom;
                int lanjut;
                cout << "Pilih Kursi (1=tersedia, 0=sudah ditempati)\nBaris: ";
                cin >> baris;
                cout << "Kolom: ";
                cin >> kolom;

                if (cin.fail()) {
                    cout << "Input tidak valid, silakan coba lagi." << endl;
                    cin.clear(); // Membersihkan state error
                    cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Mengabaikan input yang salah
                    continue; // Kembali ke awal loop
                }

                if (bioskop.setSeat(baris, kolom)) {
                    cout << "Kursi berhasil dipesan!" << endl;
                    biaya += 35000; //assignment operation
                }

                bool validInput = false;
                do {
                    cout << "Mau pesan lagi? (1=ya, 0=tidak): ";
                    cin >> lanjut;
                    if (cin.fail() || (lanjut != 1 && lanjut != 0)) {
                        cout << "Input tidak valid, silakan coba lagi." << endl;
                        cin.clear(); // Membersihkan state error
                        cin.ignore(numeric_limits<streamsize>::max(), '\n'); // Mengabaikan input yang salah
                    } else {
                        validInput = true;
                    }
                } while (!validInput);

                if (lanjut != 1) {
                    bioskop.tampilkanStruk(biaya);
                    pilihseat = false;
                }
            } while (pilihseat);
            break;
        }
        case 2:
            cout << "One Piece: Shipuden\nRilis: 27 Juni 2027\n" << endl;
            cout << "Tekan apa saja untuk kembali ke menu..." << endl;
            cin.ignore();
            cin.get();
            break;
        case 3:
            mulai = false;
            cout << "Terima kasih telah menggunakan layanan kami!" << endl;
            break;
        default:
            cout << "Pilihan tidak valid, silakan coba lagi." << endl;
            break;
        }
    }

    return 0;
}

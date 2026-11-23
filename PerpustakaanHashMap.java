import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PerpustakaanHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> dataAnggota = new HashMap<>();
        int pilihan;

        do {
            System.out.println("\n=== DATA ANGGOTA PERPUSTAKAAN ===");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tampilkan Semua Anggota");
            System.out.println("3. Cari Nama Anggota");
            System.out.println("4. Hapus Anggota");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan ID Anggota: ");
                String id = input.nextLine();
                System.out.print("Masukkan Nama Anggota: ");
                String nama = input.nextLine();
                dataAnggota.put(id, nama);
                System.out.println("Anggota berhasil ditambahkan!");
            } else if (pilihan == 2) {
                System.out.println("\n--- DAFTAR ANGGOTA ---");
                if (dataAnggota.isEmpty()) {
                    System.out.println("Belum ada data anggota.");
                } else {
                    Set<String> daftarId = dataAnggota.keySet();
                    for (String kunci : daftarId) {
                        System.out.println("ID: " + kunci + " | Nama: " + dataAnggota.get(kunci));
                    }
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan ID Anggota yang dicari: ");
                String idCari = input.nextLine();
                String hasil = dataAnggota.get(idCari);
                if (hasil != null) {
                    System.out.println("Nama Anggota: " + hasil);
                } else {
                    System.out.println("Anggota tidak ditemukan.");
                }
            } else if (pilihan == 4) {
                System.out.print("Masukkan ID Anggota yang akan dihapus: ");
                String idHapus = input.nextLine();
                String namaTerhapus = dataAnggota.remove(idHapus);
                if (namaTerhapus != null) {
                    System.out.println("Anggota '" + namaTerhapus + "' berhasil dihapus!");
                } else {
                    System.out.println("Anggota tidak ditemukan.");
                }
            } else if (pilihan != 5) {
                System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 5);

        System.out.println("Terima kasih telah menggunakan layanan kami.");
        input.close();
    }
}
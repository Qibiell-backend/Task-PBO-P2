import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarBuku = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n=== PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan judul buku: ");
                String judul = input.nextLine();
                daftarBuku.add(judul);
                System.out.println("Buku berhasil ditambahkan!");
            } else if (pilihan == 2) {
                System.out.println("\n--- DAFTAR BUKU ---");
                if (daftarBuku.isEmpty()) {
                    System.out.println("Belum ada buku di daftar.");
                } else {
                    for (int i = 0; i < daftarBuku.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarBuku.get(i));
                    }
                }
            } else if (pilihan == 3) {
                System.out.print("Masukkan judul buku yang akan dihapus: ");
                String cari = input.nextLine();
                if (daftarBuku.contains(cari)) {
                    daftarBuku.remove(cari);
                    System.out.println("Buku berhasil dihapus!");
                } else {
                    System.out.println("Buku tidak ditemukan.");
                }
            } else if (pilihan != 4) {
                System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 4);

        System.out.println("Terima kasih telah menggunakan layanan kami.");
        input.close();
    }
}

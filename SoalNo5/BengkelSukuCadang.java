package SoalNo5;
import java.util.ArrayList;

class SukuCadang {
    private String nama;
    private int stok;

    public SukuCadang(String nama, int stok) {
        this.nama = nama;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }
}

class Bengkel {
    private String namaBengkel;
    private ArrayList<SukuCadang> daftarSukuCadang;

    public Bengkel(String namaBengkel) {
        this.namaBengkel = namaBengkel;
        daftarSukuCadang = new ArrayList<>();
    }

    public void tambahSukuCadang(String nama, int stok) {
        SukuCadang sc = new SukuCadang(nama, stok);
        daftarSukuCadang.add(sc);
    }

    public void tampilkanSukuCadang() {
        System.out.println("\n--- Suku Cadang di " + namaBengkel + " ---");
        if (daftarSukuCadang.isEmpty()) {
            System.out.println("Belum ada suku cadang.");
        } else {
            for (int i = 0; i < daftarSukuCadang.size(); i++) {
                SukuCadang s = daftarSukuCadang.get(i);
                System.out.println((i + 1) + ". " + s.getNama() + " | Stok: " + s.getStok());
            }
        }
    }

    public void hapusSemuaSukuCadang() {
        System.out.println("\nBengkel ditutup. Semua suku cadang dihapus!");
        daftarSukuCadang.clear();
    }
}

public class BengkelSukuCadang {
    public static void main(String[] args) {
        Bengkel bengkelKu = new Bengkel("Bengkel Sejahtera");

        bengkelKu.tambahSukuCadang("Oli Mesin", 20);
        bengkelKu.tambahSukuCadang("Busi", 50);
        bengkelKu.tambahSukuCadang("Filter Udara", 15);

        bengkelKu.tampilkanSukuCadang();

        bengkelKu.hapusSemuaSukuCadang();

        bengkelKu.tampilkanSukuCadang();
    }
}

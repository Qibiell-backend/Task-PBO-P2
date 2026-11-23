package SoalNo4;
import java.util.ArrayList;

class Mekanik {
    private String nama;

    public Mekanik(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class Bengkel {
    private String namaBengkel;
    private ArrayList<Mekanik> daftarMekanik;

    public Bengkel(String namaBengkel) {
        this.namaBengkel = namaBengkel;
        daftarMekanik = new ArrayList<>();
    }

    public void tambahMekanik(Mekanik mekanik) {
        daftarMekanik.add(mekanik);
        System.out.println(mekanik.getNama() + " ditugaskan di " + namaBengkel);
    }

    public void tampilkanDaftarMekanik() {
        System.out.println("\n--- Daftar Mekanik di " + namaBengkel + " ---");
        if (daftarMekanik.isEmpty()) {
            System.out.println("Belum ada mekanik yang ditugaskan.");
        } else {
            for (int i = 0; i < daftarMekanik.size(); i++) {
                System.out.println((i + 1) + ". " + daftarMekanik.get(i).getNama());
            }
        }
    }
}

public class BengkelMekanik {
    public static void main(String[] args) {
        Bengkel bengkelKu = new Bengkel("Bengkel Selamat Jaya");

        Mekanik m1 = new Mekanik("Andi");
        Mekanik m2 = new Mekanik("Siti");
        Mekanik m3 = new Mekanik("Rian");

        bengkelKu.tambahMekanik(m1);
        bengkelKu.tambahMekanik(m2);
        bengkelKu.tambahMekanik(m3);

        bengkelKu.tampilkanDaftarMekanik();
    }
}
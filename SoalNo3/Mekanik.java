package SoalNo3;

public class Mekanik {
    private String nama;
    private double gaji;
    private String spesialisasi;

    public Mekanik(String nama, double gaji, String spesialisasi) {
        this.nama = nama;
        setGaji(gaji);
        this.spesialisasi = spesialisasi;
    }

    public String getNama() { return nama; }
    public double getGaji() { return gaji; }
    public String getSpesialisasi() { return spesialisasi; }

    public void setNama(String nama) { this.nama = nama; }
    public void setGaji(double gaji) {
        if (gaji >= 3000000) {
            this.gaji = gaji;
        } else {
            System.out.println("Gaji tidak boleh kurang dari UMR");
        }
    }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }
}

class MainMekanik {
    public static void main(String[] args) {
        Mekanik m1 = new Mekanik("Habil", 4500000, "Programmer");
        System.out.println("Nama: " + m1.getNama());
        System.out.println("Gaji: " + m1.getGaji());
        System.out.println("Spesialisasi: " + m1.getSpesialisasi());
    }
}

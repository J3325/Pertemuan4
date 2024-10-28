package pertemuan4;

public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public float hitungLuas() {
        return sisi * sisi;
    }
    public float hitungKeliling() {
        return 4 * sisi;
    }
}

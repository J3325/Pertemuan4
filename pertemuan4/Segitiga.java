package pertemuan4;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float hitungLuas() {
        return (alas * tinggi) / 2.0f;
    }

    public float hitungKeliling() {
        return alas + tinggi + (float) Math.sqrt(alas * alas + tinggi * tinggi);
    }
}

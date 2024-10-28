package pertemuan4;

public class Lingkaran extends BangunDatar {
    private int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    public float hitungLuas() {
        return (float) (Math.PI * r * r);
    }

    public float hitungKeliling() {
        return (float) (2 * Math.PI * r);
    }
}

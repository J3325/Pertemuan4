package pertemuan4;

public class Utama {
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(8);
        BangunDatar segitiga = new Segitiga(5, 10);
        BangunDatar persegi = new Persegi(6);

        System.out.println("Lingkaran");
        System.out.println("Luas: " + lingkaran.hitungLuas());
        System.out.println("Keliling: " + lingkaran.hitungKeliling());

        System.out.println("\nSegitiga");
        System.out.println("Luas: " + segitiga.hitungLuas());
        System.out.println("Keliling: " + segitiga.hitungKeliling());

        System.out.println("\nPersegi");
        System.out.println("Luas: " + persegi.hitungLuas());
        System.out.println("Keliling: " + persegi.hitungKeliling());
    }
}

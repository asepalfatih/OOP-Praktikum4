package polymorpisme;

public class main {
    public static void main(String[] args) {
        
        Lingkaran lingkaran = new Lingkaran();
        segitiga Segitiga = new segitiga();
        Persegi persegi = new Persegi();

        System.out.println("Laus LIngkaran : " + lingkaran.luas());
        System.out.println("Luas KEliling Lingkaran : " + lingkaran.keliling());

        System.out.println("Luas Segitiga : " + Segitiga.luas());
        System.out.println("Keliling segitiga : " + Segitiga.keliling());

        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("keliling Persegi : " + persegi.keliling());
    }
}

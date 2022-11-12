package polymorpisme;

public class segitiga extends BangunDatar {

    protected final int alas = 5;
    protected final int tinggi = 10;

    public float luas(){
        return (float) (0.5 * this.alas * this.tinggi);
    }

    public float keliling(){
        return (float) (3 * this.alas);
    }
    
}

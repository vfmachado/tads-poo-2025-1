public class Cor {
    private int r;
    private int g;
    private int b;

    // IDEALMENTE FAZEMOS ASSIM
    public Cor() {
        this.r = 0;
        this.g = 0;
        this.b = 0;
    }

    public Cor(String nome) {

    }

    public Cor(int r, int g, int b) {
        
    }

    public int getRed() {
        return this.r;
    }

    public void setRed(int r) {
        if (r < 0) {
            this.r = 0;
        } else if (r > 255) {
            this.r = 255;
        } else {
            this.r = r;
        }
    }
}

public class Cachorro implements IAndar {

    @Override
    public String andar() {
        return "Sou um cachorro que sabe andar";
    }
    
    public void latir() {
        System.out.println("LATINDO AU AU");
    }
}

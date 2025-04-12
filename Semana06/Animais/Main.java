import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Tartaruga tartaruga = new Tartaruga();

        // System.out.println(cachorro.andar());
        // System.out.println(gato.andar());
        // System.out.println(tartaruga.andar());
        
        List<IAndar> animaisQueAndam = new ArrayList<IAndar>();
        animaisQueAndam.add(tartaruga);
        animaisQueAndam.add(cachorro);
        animaisQueAndam.add(gato);

        for (IAndar animal : animaisQueAndam) {
            System.out.println(animal.andar());
        }
    }

}
import java.util.ArrayList;
import java.util.List;

// T = tipo
// E = elem
// U, V, X, ...
public class Caixa<T> {
    private List<T> items = new ArrayList<>();
    
    public void colocar(T item) {
        items.add(item);
    }

    public void retirar(T item) {
        items.remove(item);
    }

    public void olhar() {
        for (T t : items) {
            System.out.println(t);
        }
    }
}

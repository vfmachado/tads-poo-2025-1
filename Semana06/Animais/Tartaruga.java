public class Tartaruga implements IAndar, INadar {

    @Override
    public String andar() {
        return "Tartaruga, mais rasteja que anda";
    }

    @Override
    public String nadar() {
        return "Tartaruga, nado melhor que ando";
    }
    
}

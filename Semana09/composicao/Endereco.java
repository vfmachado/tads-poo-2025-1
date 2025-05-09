package composicao;

// removi o public da classe endereco
// com isso, estamos alterando a visibildiade desta classe em relacao a outros pacotes
class Endereco {
    private String end;

    public Endereco(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return end;
    }
}

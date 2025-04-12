public class Produto {
    
    private String nome;
    private float preco;

    Produto(String nome, float preco) {
        this.nome = nome;
        setPreco(preco);
        // this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }
                        // parametro
    public void setPreco(float preco) {
        // parametro
        if (preco < 0) {
            // o atributo
            this.preco = 0;
        } else {
            // atributo     parametro
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Nome  " + this.nome + " - R$ " + this.preco;
    }
}

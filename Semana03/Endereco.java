public class Endereco {
    // ATRIBUTOS
    // ADICIONAR METODOS GET E SET PARA TODOS OS ATRIBUTOS QUE FAZEM SENTIDO
    private String cep;
    private String bairro;
    private String numero;
    private String rua;
    private String cidade;
    private String estado;
    private String complemento;

    // POR PADRAO QUANDO NAO DECLARAMOS O CONSTRUTOR, ELE CRIA O CONSTRUTOR PADRAO
    // PUBLIC E VAZIO (SEM ATRIBUTOS)

    // DENTRO DO NOSSO CONTEXTO, ESSE CONSTRUTOR NAO É LEGAL
    // public Endereco() {
    // }

    public Endereco(String cep, String numero) {
        this.cep = cep;
        this.numero = numero;
        this.complemento = "";
    }

    // CONSTRUTOR -> DETERMIANR O ESTADO INICIAL DA INSTANCIA
    public Endereco(String cep, String rua, String numero) {
        this.cep = cep;
        this.numero = numero;
        this.rua = rua;
        this.complemento = "";
    }

    public String getCep() {
        return this.cep;
    }

    public void setComplemento(String complemento) {
        if (complemento.length() > 10) {
            this.complemento = complemento.substring(0, 10) + "...";
        } else {
            this.complemento = complemento;
        }
    }

    // toString vai sobrescrever o toString padrao do java
    public String toString() {
        return "CEP " + cep + "\nNum " + numero + (complemento.isEmpty() ?  "" : "\nComplem " + complemento);
    }
}

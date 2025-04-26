// ABSTRACT -> CLASSE ABSTRATA, LOGO NAO PODE SER INSTANCIADA
// NAO EXISTE NEW PESSOA NO SISTEMA
public abstract class Pessoa {
    
    private String nome;
    private String matricula;
    private String email;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    // CLASSES ABSTRATAR PERMITEM MÉTODOS ABSTRATOS, AS CLASSES QUE HERDAM DEVEM IMPLEMENTAR
    public abstract String getEmail();

    @Override   // pq herda da classe Object   ... java.lang
    public String toString() {
        return this.nome + " - " + this.getEmail();
    }
}

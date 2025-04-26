public class Professor extends Pessoa {

    // COMO A CLASSE PAI DEFINE UM CONSTRUTOR, A CLASSE QUE HERDA PRECISA CHAMAR ESTE CONSTRUTOR
    public Professor(String nome) { 
        super(nome);  // CHAMANDO O CONSTRUTOR DA CLASSE PESSOA
    }
    
    @Override
    public String getEmail() {
        return this.getNome().replaceAll(" ", ".").toLowerCase() + "@riogrande.ifrs.edu.br";
    }
     
    public void darAula() {
        System.out.println("professor dando aula");
    }
}

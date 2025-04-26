public class Aluno extends Pessoa {

    // COMO A CLASSE PAI DEFINE UM CONSTRUTOR, A CLASSE QUE HERDA PRECISA CHAMAR ESTE CONSTRUTOR
    public Aluno(String nome) { 
        super(nome);  // CHAMANDO O CONSTRUTOR DA CLASSE PESSOA
    }
    
    @Override
    public String getEmail() {
        return this.getNome().replaceAll(" ", ".").toLowerCase() + "@aluno.riogrande.ifrs.edu.br";
    }
     
}

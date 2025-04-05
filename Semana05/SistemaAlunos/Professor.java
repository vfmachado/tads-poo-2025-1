public class Professor {
    
    private String nome;
    
    Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void darNota(Turma turma, Aluno a, float nota) throws Exception {
        if (turma.getProfessor() == this) {
            turma.getAlunosNota().replace(a, nota);
        } else {
            throw new Exception("O professor nao pode atribuir nota nessa turma");
        }
    }
}

package associacao;

public class Curso {
    private String nome;
    private Professor professor;        // associacao

    public Curso(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        if (professor == null) {
            return nome + " sem professor.";
        }

        return this.nome + " - " + professor;
    }
}
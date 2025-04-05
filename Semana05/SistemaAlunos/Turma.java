import java.util.HashMap;

public class Turma {
    // LISTA DE ALUNOS
    private HashMap<Aluno, Float> alunosNota;
    /*
    hashmap é uma estrutura de dados que guarda uma "lista" de chaves e valores
        <Chave, Valor>
    neste exemplo o aluno representará a chave e o o float a nota
     */

    private Disciplina disciplina;
    private Professor professor; 
    
    Turma(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunosNota = new HashMap<Aluno, Float>();
    }

    public HashMap<Aluno, Float> getAlunosNota() {
        return alunosNota;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void listarAlunos() {
        for (Aluno a : alunosNota.keySet()) {
            System.out.println(a);
        }
    }

    public void matricular(Aluno a) {
        // this.alunos.add(a);
        this.alunosNota.put(a, 0.0f);
    }

    public float getNota(Aluno a) {
        return this.alunosNota.get(a);
    } 

    // uma possibilidade é a turma ter o método de atribuição de nota já que a turma GUARDA o dado
    public void darNota(Aluno a, float nota) {
        this.alunosNota.replace(a, nota);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Professor prof = new Professor("Vinicius");
        Disciplina poo = new Disciplina("POO");
        Turma turma = new Turma(poo, prof);
        
        System.out.println(turma.getProfessor().getNome().equals(prof.getNome()));
        System.out.println(turma.getDisciplina().getNome().equals(poo.getNome()));
        
        Aluno gui = new Aluno("Guilherme");
        Aluno murilo = new Aluno("Murilo");
        Aluno ze = new Aluno("ZE");
        // Aluno julie = new Aluno("Julie");
        // Aluno adriana = new Aluno("Adriana");

        turma.matricular(gui);
        turma.matricular(gui);
        turma.matricular(murilo);
        turma.matricular(ze);
        // turma.matricular(adriana);
        // turma.matricular(julie);

        turma.listarAlunos();   // lista disciplina, professor e alunos
        
        // onde fica a nota?  ...  
        Professor p = new Professor("MARCIO");
        try {
            p.darNota(turma, murilo, 8);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        turma.darNota(gui, 10);
        turma.darNota(ze, 5);
        System.out.println(turma.getNota(gui));
        System.out.println(turma.getNota(murilo));
        System.out.println(turma.getNota(ze));

        // TEMA PRA CASA =)
        // aluno.verNota(turma)

    }
}

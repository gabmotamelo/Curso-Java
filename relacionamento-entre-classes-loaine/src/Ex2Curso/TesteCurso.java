package Ex2Curso;

public class TesteCurso {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNome("Matematica");
        curso.setHorario("Terça");


        Aluno aluno1 = new Aluno();
        aluno1.setNome("Marcos");
        aluno1.setMatricula("12322");
        aluno1.setNota1(7.3);
        aluno1.setNota2(5.6);
        aluno1.setNota3(3.4);
        aluno1.setNota4(8.6);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maic");
        aluno2.setMatricula("133");
        aluno2.setNota1(5.3);
        aluno2.setNota2(4.6);
        aluno2.setNota3(2.4);
        aluno2.setNota4(9.6);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Caros");
        aluno3.setMatricula("22");
        aluno3.setNota1(7.3);
        aluno3.setNota2(7.6);
        aluno3.setNota3(8.4);
        aluno3.setNota4(8.6);

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Jon");
        aluno4.setMatricula("11");
        aluno4.setNota1(2.3);
        aluno4.setNota2(8.6);
        aluno4.setNota3(1.4);
        aluno4.setNota4(8.6);

        Aluno aluno5 = new Aluno();
        aluno5.setNome("Salvo");
        aluno5.setMatricula("265");
        aluno5.setNota1(6.3);
        aluno5.setNota2(8.6);
        aluno5.setNota3(2.4);
        aluno5.setNota4(8.6);

        Aluno[] alunos = new Aluno[5];
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;
        alunos[4] = aluno5;

        curso.setAlunos(alunos);

        Professor professorMat = new Professor();
        professorMat.setNome("Michel");
        professorMat.setEmail("gabreom@hotmail.com");
        professorMat.setDepartamento("Professor de Matemática");
        curso.setProfessor(professorMat);


        System.out.println(curso.getNome());
        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso.getProfessor().getDepartamento());
        System.out.println(curso.getProfessor().getEmail());
        System.out.println(curso.getHorario());

        if (curso != null && curso.getAlunos() != null){
            for (Aluno alu : curso.getAlunos()){
                System.out.println(alu.getNome());
                System.out.println(alu.getMatricula());
                System.out.println(alu.getMedia());
                System.out.println(alu.getAprovacao());
            }
        }
    }
}

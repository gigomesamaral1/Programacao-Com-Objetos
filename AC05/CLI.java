public class CLI {
    public static void main(String[] args) {
        AlunoDAO crud = new AlunoDAO();

        crud.adicionarAluno("1", "João", "Engenharia");
        crud.adicionarAluno("2", "Maria", "Medicina");
        crud.adicionarAluno("3", "Pedro", "Direito");

        System.out.println("Lista de todos os alunos:");
        for (Aluno aluno : crud.listarTodosAlunos()) {
            System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " - " + aluno.getCurso());
        }

        crud.atualizarCurso("1", "Ciência da Computação");

        System.out.println("\nAluno com matrícula 1:");
        Aluno aluno1 = crud.listarAlunoPorMatricula("1");
        if (aluno1 != null) {
            System.out.println(aluno1.getMatricula() + " - " + aluno1.getNome() + " - " + aluno1.getCurso());
        } else {
            System.out.println("Aluno não encontrado.");
        }

        crud.removerAluno("2");

        System.out.println("\nLista de todos os alunos após remoção:");
        for (Aluno aluno : crud.listarTodosAlunos()) {
            System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " - " + aluno.getCurso());
        }
    }
}

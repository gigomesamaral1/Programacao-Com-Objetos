package view;

import dao.AlunoDAO;
import model.Aluno;

import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {
        AlunoDAO crud = new AlunoDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Remover aluno");
            System.out.println("3. Atualizar curso de aluno");
            System.out.println("4. Listar todos os alunos");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    Aluno novoAluno = new Aluno(matricula, nome, curso);
                    crud.adicionarAluno(novoAluno);
                    break;
                case 2:
                    System.out.print("Matrícula do aluno a ser removido: ");
                    String matriculaRemover = scanner.nextLine();
                    crud.removerAluno(matriculaRemover);
                    break;
                case 3:
                    System.out.print("Matrícula do aluno a ser atualizado: ");
                    String matriculaAtualizar = scanner.nextLine();
                    System.out.print("Novo curso: ");
                    String novoCurso = scanner.nextLine();
                    crud.atualizarCurso(matriculaAtualizar, novoCurso);
                    break;
                case 4:
                    System.out.println("Lista de todos os alunos:");
                    crud.listarTodosAlunos();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

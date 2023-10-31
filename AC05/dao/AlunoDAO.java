package dao;

import model.Aluno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private List<Aluno> alunos;
    private static final String FILENAME = "alunos.txt";

    public AlunoDAO() {
        alunos = new ArrayList<>();
        carregarAlunos();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            salvarAlunos();
        }
    }

    public void removerAluno(String matricula) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            alunos.remove(aluno);
            salvarAlunos();
        }
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        Aluno aluno = buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            aluno.setCurso(novoCurso);
            salvarAlunos();
        }
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public void listarTodosAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    private void carregarAlunos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    alunos.add(new Aluno(parts[0], parts[1], parts[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void salvarAlunos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Aluno aluno : alunos) {
                writer.write(aluno.getMatricula() + "," + aluno.getNome() + "," + aluno.getCurso());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

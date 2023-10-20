import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private List<Aluno> alunos;

    public AlunoDAO() {
        alunos = new ArrayList<>();
    }

    public List<Aluno> getAlunos() {
        return this.alunos;
    }


    public void adicionarAluno(String matricula, String nome, String curso) {
        Aluno aluno = new Aluno(matricula, nome, curso);
        alunos.add(aluno);
    }

    public void removerAluno(String matricula) {
        alunos.removeIf(a -> a.getMatricula().equals(matricula));
    }

    public void atualizarCurso(String matricula, String novoCurso) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.setCurso(novoCurso);
                return;
            }
        }
    }

    public Aluno listarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> listarTodosAlunos() {
        return alunos;
    }


    @Override
    public String toString() {
        return 
            " alunos='" + getAlunos() + "'";
    }

}


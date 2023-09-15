package entidades.pessoas;

import java.time.LocalDate;

import entidades.Planosaude;

public class Paciente extends Pessoa {
    private Planosaude plano;

    public Paciente(String nome, String cpf, Endereco endereco, LocalDate dataNascimento){
        super(nome, cpf, endereco, dataNascimento);
        this.plano = new Planosaude
    }
}
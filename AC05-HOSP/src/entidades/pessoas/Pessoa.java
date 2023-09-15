package entidades.pessoas;

import java.time.LocalDate;

import entidades.Endereco;

public abstract class Pessoa {
    String nome, cpf;
    Endereco endereco;
    private LocalDate dataNascimento;


    public Pessoa(String nome, String cpf, Endereco endereco, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    


    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", endereco='" + getEndereco() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            "}";
    }
}

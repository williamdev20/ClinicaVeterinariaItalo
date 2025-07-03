package br.com.william.clinicaveterinaria.usuario;

public class Veterinario {
    private String nome;
    private String cpf;
    private int tempoAtuacao;

    //Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTempoAtuacao() {
        return tempoAtuacao;
    }

    public void setTempoAtuacao(int tempoAtuacao) {
        this.tempoAtuacao = tempoAtuacao;
    }
}

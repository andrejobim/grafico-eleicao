package br.com.soulcodesoft;

public class Candidato {

    private String nome;
    private Integer totalVoto;

    public Candidato(String nome, Integer totalVoto) {
        this.nome = nome;
        this.totalVoto = totalVoto;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTotalVoto() {
        return totalVoto;
    }
}

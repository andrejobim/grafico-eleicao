package br.com.soulcodesoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Municipio {

    private final Random gerarTotalVotoAleatorios = new Random();

    private String nomeMunicipio;
    private List<Candidato> candidatos = new ArrayList<>();

    public Municipio(Integer totalEleitores, String nomeMunicipio) {
        totalEleitores = totalEleitores > 0 ? totalEleitores : 1;
        this.nomeMunicipio = nomeMunicipio;
        candidatos.add(new Candidato("Presidente A", gerarTotalVotoAleatorios.nextInt(totalEleitores)));
        candidatos.add(new Candidato("Presidente B", gerarTotalVotoAleatorios.nextInt(totalEleitores)));
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }
}

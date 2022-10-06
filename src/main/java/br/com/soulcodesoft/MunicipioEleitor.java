package br.com.soulcodesoft;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MunicipioEleitor {

    private static final Random gerarTotalEleitorOuHabilitantePorMunicipio = new Random();
    private final List<Municipio> municipios = new ArrayList<>();

    public MunicipioEleitor(Integer totalMunicipio, Integer totalHabitantePorMunicipio) {
        for (int indice = 1; indice <= totalMunicipio; indice++){
            totalHabitantePorMunicipio = totalHabitantePorMunicipio > 0 ? totalHabitantePorMunicipio: 1;
            Integer totalHabilitantePorMunicipio = gerarTotalEleitorOuHabilitantePorMunicipio.nextInt(totalHabitantePorMunicipio);
            totalHabilitantePorMunicipio = totalHabilitantePorMunicipio > 0 ? totalHabilitantePorMunicipio: 1;
            Integer totalEleitorPorMunicipio = gerarTotalEleitorOuHabilitantePorMunicipio.nextInt(totalHabilitantePorMunicipio);
            String nomeAleatorioMunicipio = RandomStringUtils.random(10, Boolean.TRUE, Boolean.FALSE);
            Municipio municipio = new Municipio(totalEleitorPorMunicipio, nomeAleatorioMunicipio);
            municipios.add(municipio);
        }
    }
    public List<Municipio> getMunicipios() {
        return municipios;
    }
}

package br.com.soulcodesoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Estado {

    private static final Integer TOTAL = 100;
    private final List<MunicipioEleitor> municipioEleitores = new ArrayList<>();
    private final Random gerarTotalMunicipioHabitante = new Random();
    private String nomeEstado;

    public Estado(String nomeEstado) {
        Integer totalMunicipio = gerarTotalMunicipioHabitante.nextInt(TOTAL);
        Integer totalHabitantePorMunicipio = gerarTotalMunicipioHabitante.nextInt(TOTAL);
        this.nomeEstado = nomeEstado;
        this.municipioEleitores.add(new MunicipioEleitor(totalMunicipio, totalHabitantePorMunicipio));    }

    public List<MunicipioEleitor> getMunicipioEleitores() {
        return municipioEleitores;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }
}

package br.com.soulcodesoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EleicaoEstado {

    private static final Integer TOTAL_ESTADO_MAIS_DF = 27;
    private static final List<String> nomeEstados =  Arrays
            .asList("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB",
                    "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");
    private final List<Estado> estados = new ArrayList<>();

    public EleicaoEstado() {
        for (int indice = 0; indice < TOTAL_ESTADO_MAIS_DF; indice++){
            this.estados.add(new Estado(nomeEstados.get(indice)));
        }
    }

    public List<Estado> getEstados() {
        return estados;
    }
}

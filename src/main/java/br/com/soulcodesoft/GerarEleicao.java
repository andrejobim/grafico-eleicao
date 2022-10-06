package br.com.soulcodesoft;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GerarEleicao {

    private static BufferedWriter buffWrite;

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\André Jobim\\eleicaoSimularacao.txt");
        FileWriter fileWriter = new FileWriter(file.getPath(), Boolean.TRUE);
        buffWrite = new BufferedWriter(fileWriter);;

        EleicaoEstado eleicaoEstado = new EleicaoEstado();
        List<Estado> estados = eleicaoEstado.getEstados();

        for (Estado estado: estados){
            processarEstados(estado);
        }
        buffWrite.close();
        fileWriter.close();
    }

    private static void processarEstados(Estado estado) throws IOException {
        List<MunicipioEleitor> municipioEleitores = estado.getMunicipioEleitores();
        for(MunicipioEleitor municipioEleitor : municipioEleitores){
            List<Municipio> municipios = municipioEleitor.getMunicipios();
            for (Municipio municipio: municipios){
                processarMunicipios(municipio, estado);
            }
        }
    }

    private static void processarMunicipios(Municipio municipio, Estado estado) throws IOException {
        List<Candidato> candidatos = municipio.getCandidatos();
        for (Candidato candidato: candidatos){
            buffWrite.append(processarCandidatos(municipio, estado, candidato));
            buffWrite.newLine();
        }
    }

    private static String processarCandidatos(Municipio municipio, Estado estado, Candidato candidato) {
        return String.join(";",estado.getNomeEstado(), municipio.getNomeMunicipio(), candidato.getNome(), candidato.getTotalVoto().toString());
    }
}

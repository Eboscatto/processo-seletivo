package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void analisarCandidatos(double salarioPretendido) {

        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    public static List<String> selecionarCandidatos() {

        String [] todosCandidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO","DANIELA","JORGE"};

        List<String> candidatosSelecionadosLista = new ArrayList<>();

                int candidatosSelecionados = 0;
                int candidatosAtualizdos = 0;
                double salarioBase = 2000.0;
                while(candidatosSelecionadosLista.size() < 5 && candidatosAtualizdos < todosCandidatos.length) {
                    String candidatoAtual = todosCandidatos[candidatosAtualizdos];
                    double salarioPretendido = valorPretendido();

                    System.out.println("O candidato " + candidatoAtual + " solicitou este valor de salário " + salarioPretendido);
                    if(salarioBase >= salarioPretendido) {
                        System.out.println("O candidato " + candidatoAtual + " foi selecionado pra a vaga.");
                        candidatosSelecionadosLista.add(candidatoAtual);
                    }
                    candidatosAtualizdos++;

                }
                return candidatosSelecionadosLista;
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    public static void imprimirSelecionados(List<String> listaDeSelecionados) {
        System.out.println("\n--- Lista de candidatos selecionados dinâmicamente ---");

        if (listaDeSelecionados.isEmpty()) {
            System.out.println("Nenhum candidato foi selecionado ainda.");
        } else {
            for(String candidato:  listaDeSelecionados) {
                System.out.println("_ " + candidato);
            }
        }

        System.out.println("-----------------------------------------------------\n");
    }

}

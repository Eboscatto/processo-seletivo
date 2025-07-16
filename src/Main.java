import java.util.List;

import static candidatura.ProcessoSeletivo.analisarCandidatos;
import static candidatura.ProcessoSeletivo.imprimirSelecionados;
import static candidatura.ProcessoSeletivo.selecionarCandidatos;

public class Main {

    public static void main(String[] args) {

        System.out.println("BEM VINDO AO SISTEMA DE PROCESSO  SELETIVO!");

        //chamar o método analisarCandidatos

        System.out.println("\n----------- Exibindo as mensagens -----------:");

        analisarCandidatos(1900.0);
        analisarCandidatos(2200.0);
        analisarCandidatos(2000.0);

        System.out.println();

        System.out.println("\n--------------------- Lista de inscritos ---------------------:");

        // chama o método selecionarCandidatos
        selecionarCandidatos();

        List<String> selecionados = selecionarCandidatos(); // chama o método e recebe a lista
        imprimirSelecionados(selecionados); // passa a lista para o método de impressão
    }
}
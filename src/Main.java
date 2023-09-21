import modelo.Financiamento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<Financiamento>();
        util.InterfaceUsuario interfaceUsuario = new util.InterfaceUsuario();
        int i;

        for (i=1; i<=4; i++){
            System.out.println("Financiamento " + i);
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJuros = interfaceUsuario.pedirTaxaJuros();
            modelo.Financiamento financiamento = new modelo.Financiamento(valorImovel, prazoFinanciamento, taxaJuros);
            listaFinanciamentos.add(financiamento);
        }
        for (Financiamento item : listaFinanciamentos){
            item.imprimir();
        }
    }
}

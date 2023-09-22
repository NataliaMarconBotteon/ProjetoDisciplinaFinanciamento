import modelo.Financiamento;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<Financiamento>();
        util.InterfaceUsuario interfaceUsuario = new util.InterfaceUsuario();

        double valorImovel;
        int prazoFinanciamento;
        double taxaJuros;
        double descontoNaParcela;
        double taxaDecrescente;

        /*
         * Casa 1
         * */
        System.out.println("Financiamento de Casa");

        valorImovel = interfaceUsuario.pedirValorImovel();
        prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        taxaJuros = interfaceUsuario.pedirTaxaJuros();
        descontoNaParcela = interfaceUsuario.pedirDescontoNaParcela();

        modelo.FinanciamentoCasa financiamentoCasa1 = new modelo.FinanciamentoCasa(valorImovel, prazoFinanciamento, taxaJuros, descontoNaParcela);

        listaFinanciamentos.add(financiamentoCasa1);

        /*
        * Casa 2
        * */
        valorImovel = 10000;
        prazoFinanciamento = 15;
        taxaJuros = 1;
        descontoNaParcela = 99;

        modelo.FinanciamentoCasa financiamentoCasa2 = new modelo.FinanciamentoCasa(valorImovel, prazoFinanciamento, taxaJuros, descontoNaParcela);

        listaFinanciamentos.add(financiamentoCasa2);

        /*
         * Apartamento 1
         * */
        valorImovel = 1000000;
        prazoFinanciamento = 1;
        taxaJuros = 15;
        taxaDecrescente = 100;

        modelo.FinanciamentoApartamento financiamentoApartamento1 = new modelo.FinanciamentoApartamento(valorImovel, prazoFinanciamento, taxaJuros, taxaDecrescente);

        listaFinanciamentos.add(financiamentoApartamento1);

        /*
         * Apartamento 2
         * */
        valorImovel = 3000000;
        prazoFinanciamento = 1;
        taxaJuros = 5;
        taxaDecrescente = 200;

        modelo.FinanciamentoApartamento financiamentoApartamento2 = new modelo.FinanciamentoApartamento(valorImovel, prazoFinanciamento, taxaJuros, taxaDecrescente);

        listaFinanciamentos.add(financiamentoApartamento2);

        /*
         * Terreno 2
         * */
        valorImovel = 30000;
        prazoFinanciamento = 10;
        taxaJuros = 12;

        modelo.FinanciamentoTerreno financiamentoTerreno1 = new modelo.FinanciamentoTerreno(valorImovel, prazoFinanciamento, taxaJuros);

        listaFinanciamentos.add(financiamentoTerreno1);

        for (Financiamento item : listaFinanciamentos){
            item.imprimir();
        }
    }
}

package modelo;

import java.text.NumberFormat;

public class FinanciamentoApartamento extends Financiamento {

    private double taxaDecrescente;

    private double[] parcelas;

    public FinanciamentoApartamento(double valorImovel, int prazoFinanciamento, double taxaJuros, double taxaDecrescente) {
        super(valorImovel, prazoFinanciamento, taxaJuros);
        this.taxaDecrescente = taxaDecrescente;
    }

    @Override
    public double calcularTotalPagamento() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        double valorTotal = 0;

        System.out.println("Taxa de juros decrescente: " + formatoMoeda.format(taxaDecrescente));

        for (int i = 1; i <= getPrazoFinanciamento(); i++) {
            double mensalidade = calcularPagamentoMensal() + (taxaDecrescente / i);
            System.out.println("Mensalidade " + i + ": " + formatoMoeda.format(mensalidade));

            valorTotal += mensalidade;
        }

        return valorTotal;
    }
}

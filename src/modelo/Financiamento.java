package modelo;

import java.text.NumberFormat;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJuros;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJuros) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento * 12;
        this.taxaJuros = taxaJuros;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    private String formatar(double valor){
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        return formatoMoeda.format(valor);
    }

    public double calcularPagamentoMensal() {
        return (valorImovel / prazoFinanciamento) * (1 + (taxaJuros / 12));
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento;
    }

    public void imprimir(){
        System.out.println();
        System.out.println("Dados do Financiamento");
        System.out.println("-------");
        System.out.println("Valor do imóvel: " + this.formatar(this.getValorImovel()));
        System.out.println("o imóvel será financiando em: " + this.getPrazoFinanciamento() + " meses");
        System.out.println("Com a taxa de juros de: " + this.getTaxaJuros() + "%");
        System.out.println("-------");
        System.out.println("Pagamento mensal: " + this.formatar(this.calcularPagamentoMensal()));
        System.out.println("Total do pagamento: " + this.formatar(this.calcularTotalPagamento()));
    }
}

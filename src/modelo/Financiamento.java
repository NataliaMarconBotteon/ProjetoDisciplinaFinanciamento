package modelo;

import java.io.Serializable;
import java.text.NumberFormat;

public abstract class Financiamento implements Serializable {
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJuros;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJuros) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
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

    public double calcularPagamentoMensal() {
        return (getValorImovel() / (getPrazoFinanciamento() * 12)) * (1 + ((getTaxaJuros() / 100) / 12));
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * getPrazoFinanciamento() * 12;
    }

    public String formatar(double valor) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
        return formatoMoeda.format(valor);
    }

    public boolean imprimir(){
        System.out.println();
        System.out.println("Dados do Financiamento");
        System.out.println("-------");
        System.out.println("Valor do imóvel: " + this.formatar(this.getValorImovel()));
        System.out.println("o imóvel será financiando em: " + this.getPrazoFinanciamento() + " meses");
        System.out.println("Com a taxa de juros de: " + this.getTaxaJuros() + "%");
        System.out.println("-------");
        System.out.println("Pagamento mensal: " + this.formatar(this.calcularPagamentoMensal()));
        System.out.println("Total do pagamento: " + this.formatar(this.calcularTotalPagamento()));
        System.out.println("-------");

        return false;
    }
}

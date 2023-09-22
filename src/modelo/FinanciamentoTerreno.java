package modelo;

public class FinanciamentoTerreno extends Financiamento {
    public FinanciamentoTerreno(double valorImovel, int prazoFinanciamento, double taxaJuros) {
        super(valorImovel, prazoFinanciamento, taxaJuros);
    }

    @Override
    public double calcularTotalPagamento() {
        double valorTotal = calcularPagamentoMensal() * getPrazoFinanciamento();

        return valorTotal * (1 + 0.02);
    }
}

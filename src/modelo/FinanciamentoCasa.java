package modelo;
import java.text.NumberFormat;

public class FinanciamentoCasa extends Financiamento {

    private double descontoPorParcela;

    public FinanciamentoCasa(double valorImovel, int prazoFinanciamento, double taxaJuros, double descontoPorParcela) {
        super(valorImovel, prazoFinanciamento, taxaJuros);
        this.descontoPorParcela = descontoPorParcela;
    }

    @Override
    public double calcularPagamentoMensal() {
        double mensalidade = getValorImovel() / getPrazoFinanciamento();
        double valorComJuros = mensalidade * (1 + (getTaxaJuros() / 12));
        double taxaDeJuros = valorComJuros - mensalidade;

        if (taxaDeJuros < descontoPorParcela) {
            throw new DescontoMaiorDoQueJurosException("O desconto não pode ser maior do que os juros da mensalidade.");
        }

        return valorComJuros - descontoPorParcela;
    }
}

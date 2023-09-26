package modelo;

public class Apartamento extends Financiamento {

    private int vagasGaragem;
    private int andar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJuros, int vagasGaragem, int andar) {
        super(valorImovel, prazoFinanciamento, taxaJuros);
        this.vagasGaragem = vagasGaragem;
        this.andar = andar;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public int getAndar() {
        return andar;
    }

    @Override
    public double calcularPagamentoMensal() {
        double prazoFinanciamentoEmMeses = getPrazoFinanciamento() * 12;
        double taxaDeJurosMensal = (getTaxaJuros() / 100) / 12;

        return (taxaDeJurosMensal * getValorImovel()) /
                (1 - Math.pow(1 + taxaDeJurosMensal, -prazoFinanciamentoEmMeses));
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(valorImovel);
        builder.append("\n");
        builder.append(prazoFinanciamento);
        builder.append("\n");
        builder.append(taxaJuros);
        builder.append("\n");
        builder.append(vagasGaragem);
        builder.append("\n");
        builder.append(andar);
        builder.append("\n");

        return builder.toString();
    }
}

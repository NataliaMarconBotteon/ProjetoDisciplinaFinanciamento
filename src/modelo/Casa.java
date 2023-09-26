package modelo;

public class Casa extends Financiamento {
    private double tamanhoDeAreaConstruida;
    private double tamanhoDoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJuros, double tamanhoDeAreaConstruida, double tamanhoDoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJuros);
        this.tamanhoDeAreaConstruida = tamanhoDeAreaConstruida;
        this.tamanhoDoTerreno = tamanhoDoTerreno;
    }

    public double getTamanhoDeAreaConstruida() {
        return tamanhoDeAreaConstruida;
    }

    public double getTamanhoDoTerreno() {
        return tamanhoDoTerreno;
    }

    @Override
    public double calcularPagamentoMensal() {
        double taxaAdicionalPorParcela = 80.00;
        return super.calcularPagamentoMensal() + taxaAdicionalPorParcela;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(valorImovel);
        builder.append("\n");
        builder.append(prazoFinanciamento);
        builder.append("\n");
        builder.append(taxaJuros);
        builder.append("\n");
        builder.append(tamanhoDeAreaConstruida);
        builder.append("\n");
        builder.append(tamanhoDoTerreno);
        builder.append("\n");

        return builder.toString();
    }
}

package modelo;

public class Terreno extends Financiamento {

    private String zona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJuros, String zona) {
        super(valorImovel, prazoFinanciamento, taxaJuros);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    @Override
    public double calcularTotalPagamento() {
        double valorTotal = calcularPagamentoMensal() * getPrazoFinanciamento();

        return valorTotal * (1 + 0.02);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(valorImovel);
        builder.append("\n");
        builder.append(prazoFinanciamento);
        builder.append("\n");
        builder.append(taxaJuros);
        builder.append("\n");
        builder.append(zona);
        builder.append("\n");

        return builder.toString();
    }
}

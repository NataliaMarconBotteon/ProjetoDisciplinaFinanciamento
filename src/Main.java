public class Main {
    public static void main(String[] args) {
        util.InterfaceUsuario interfaceUsuario = new util.InterfaceUsuario();

        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJuros = interfaceUsuario.pedirTaxaJuros();

        modelo.Financiamento financiamento = new modelo.Financiamento(valorImovel, prazoFinanciamento, taxaJuros);

        financiamento.imprimir();
    }
}

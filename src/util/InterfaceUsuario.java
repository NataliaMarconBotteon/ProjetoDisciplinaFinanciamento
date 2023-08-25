package util;

import java.util.Scanner;

public class InterfaceUsuario {
    public double pedirValorImovel() {
        Scanner scanner = new Scanner(System.in);
        double valorImovel;

        do {
            System.out.print("Digite o valor do imóvel: ");
            valorImovel = scanner.nextDouble();

            if (valorImovel <= 0) {
                System.out.println("Valor inválido, tente novamente.");
            }
        } while (valorImovel <= 0);

        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        Scanner scanner = new Scanner(System.in);
        int prazoFianciamento;

        do {
            System.out.print("Digite o prazo do financiamento (em anos): ");
            prazoFianciamento = scanner.nextInt();

            if (prazoFianciamento <= 0) {
                System.out.println("Valor inválido, tente novamente.");
            }
        } while (prazoFianciamento <= 0);

        return prazoFianciamento;
    }

    public double pedirTaxaJuros() {
        Scanner scanner = new Scanner(System.in);
        double taxaJuros;

        do {
            System.out.print("Digite a taxa de juros anual (%): ");
            taxaJuros = scanner.nextDouble();

            if (taxaJuros <= 0 || taxaJuros > 100) {
                System.out.println("Valor inválido, tente novamente.");
            }
        } while (taxaJuros <= 0 || taxaJuros > 100);

        return taxaJuros;
    }
}
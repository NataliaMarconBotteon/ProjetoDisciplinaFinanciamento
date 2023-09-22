package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    public double pedirValorImovel() {
        Scanner scanner = new Scanner(System.in);
        double valorImovel = 0;

        do {
            try {
                System.out.print("Digite o valor do imóvel: ");
                valorImovel = scanner.nextDouble();

                if (valorImovel <= 0) {
                    System.out.println("Valor inválido, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                scanner.next();
            }
        } while (valorImovel <= 0);

        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        Scanner scanner = new Scanner(System.in);
        int prazoFinanciamento = 0;

        do {
            try {
                System.out.print("Digite o prazo do financiamento (em anos): ");
                prazoFinanciamento = scanner.nextInt();

                if (prazoFinanciamento <= 0) {
                    System.out.println("Valor inválido, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                scanner.next();
            }
        } while (prazoFinanciamento <= 0);

        return prazoFinanciamento;
    }

    public double pedirTaxaJuros() {
        Scanner scanner = new Scanner(System.in);
        double taxaJuros = 0;

        do {
            try {
                System.out.print("Digite a taxa de juros anual (%): ");
                taxaJuros = scanner.nextDouble();

                if (taxaJuros <= 0 || taxaJuros > 100) {
                    System.out.println("Valor inválido, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                scanner.next();
            }
        } while (taxaJuros <= 0 || taxaJuros > 100);

        return taxaJuros;
    }

    public double pedirDescontoNaParcela() {
        Scanner scanner = new Scanner(System.in);
        double descontoNaParcela = 0;

        do {
            try {
                System.out.print("Digite o desconto na parcela: ");
                descontoNaParcela = scanner.nextDouble();

                if (descontoNaParcela < 0 || descontoNaParcela > 100) {
                    System.out.println("Valor inválido, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
                scanner.next();
            }
        } while (descontoNaParcela < 0 || descontoNaParcela > 100);

        return descontoNaParcela;
    }
}
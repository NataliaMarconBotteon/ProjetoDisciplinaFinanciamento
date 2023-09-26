import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<Financiamento>();
        util.InterfaceUsuario interfaceUsuario = new util.InterfaceUsuario();

        /* Casa */
        double valorImovel = interfaceUsuario.pedirValorImovel();
        int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        double taxaJuros = interfaceUsuario.pedirTaxaJuros();

        Casa casa1 = new Casa(valorImovel, prazoFinanciamento, taxaJuros, 300, 500);
        listaFinanciamentos.add(casa1);

        Casa casa2 = new Casa(500000, 10, 10, 100, 200);
        listaFinanciamentos.add(casa2);

        /* Apartamento */
        Apartamento apartamento1 = new Apartamento(500000, 10, 10, 1, 5);
        listaFinanciamentos.add(apartamento1);

        Apartamento apartamento2 = new Apartamento(1000000, 10, 5, 2, 10);
        listaFinanciamentos.add(apartamento2);

        /* Terreno */
        Terreno terreno1 = new Terreno(500000, 10, 10, "residencial");

        listaFinanciamentos.add(terreno1);

        escreveFinanciamentos(listaFinanciamentos, "financiamento.txt");
        LeFinanciamentos("financiamento.txt");
    }

    private static void escreveFinanciamentos(ArrayList<Financiamento> financiamentos, String filename) {
        System.out.println("Escrevendo arquivo com financiamentos...");

        ObjectOutputStream outputStream = null;

        try {
            outputStream = new ObjectOutputStream (new FileOutputStream(filename));

            for (Financiamento financiamento : financiamentos){
                outputStream.writeObject(financiamento); // escreve o financiamento serializado
            }

            outputStream.flush(); // força dados em buffer a serem gravados
            outputStream.close(); // fecha arquivo de escrita

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Arquivo escrito com sucesso!");
    }

    public static void LeFinanciamentos(String filename) {
        System.out.println("Lendo arquivo com financiamentos...");

        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream (new FileInputStream(filename));

            Object obj = null;

            while ((obj = inputStream.readObject()) != null) {1
                if (obj instanceof Financiamento) // le um objeto genérico
                    ((Financiamento) obj).imprimir(); // imprime os dados do financiamento
            }

            inputStream.close();

        } catch (EOFException ex) { // quando EOF (End Of File) é alçancado
            System.out.println("Arquivo lido com sucesso!");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

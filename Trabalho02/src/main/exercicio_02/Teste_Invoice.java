package main.exercicio_02;

public class Teste_Invoice {

    public static void main(String arcs[]) {

        int NumeroDoItem = 1;
        String DescricaoItem = "Mouse logitech G403";
        int QuantidadeItem = 2;
        double PrecoItem = 200;

        Invoice Fatura1 = new Invoice(NumeroDoItem, DescricaoItem, QuantidadeItem, PrecoItem);

        System.out.println(Fatura1.getQuantidade());
        System.out.println(Fatura1.getDescricao());

        System.out.println(Fatura1.getInvoiceAmount());

    }

}

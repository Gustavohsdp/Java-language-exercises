package main.exercicio_02;

public class Invoice {

    private int Numero;
    private String Descricao;
    private int Quantidade;
    private double Preco;

    public Invoice(int num, String desc, int Quant, double pre) {

        this.Numero = num;
        this.Descricao = desc;

        if (Quant < 0) {
            this.Quantidade = 0;
        } else {
            this.Quantidade = Quant;
        }

        if (pre < 0) {
            this.Preco = 0.0;
        } else {
            this.Preco = pre;
        }
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public double getInvoiceAmount() {
        return Quantidade * Preco;
    }

}

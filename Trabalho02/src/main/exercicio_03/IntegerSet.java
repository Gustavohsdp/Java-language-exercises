package main.exercicio_03;

// import java.util.Arrays;

public class IntegerSet {

    private int Tamanho = 101;
    private boolean array[];

    public IntegerSet() {
        this.array = new boolean[Tamanho];
    }

    public IntegerSet(int tamanho) {
        this.Tamanho = tamanho;
        this.array = new boolean[Tamanho];
    }

    private IntegerSet(boolean values[]) {
        this.array = values;
    }

    public IntegerSet intersecao(IntegerSet outro) {
        boolean intersect[] = new boolean[Tamanho];
        for (int i = 0; i < Tamanho; i++) {
            intersect[i] = this.array[i] && outro.array[i];
        }
        return new IntegerSet(intersect);
    }

    public IntegerSet uniao(IntegerSet outro) {
        boolean un[] = new boolean[Tamanho];
        for (int i = 0; i < Tamanho; i++) {
            un[i] = this.array[i] || outro.array[i];
        }
        return new IntegerSet(un);
    }

    public void inserirElemento(int pos) {
        this.array[pos] = true;
    }

    public void deletarElemento(int pos) {
        this.array[pos] = false;
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Tamanho; i++) {
            if (this.array[i]) {
                if (sb.length() == 0) {
                    sb.append(i);
                } else {
                    sb.append(" ").append(i);
                }
            }
        }
        return sb.length() == 0 ? "--" : sb.toString();
    }

    public boolean verificarIgualdade(IntegerSet outro) {
        for (int i = 0; i < Tamanho; i++) {
            if (this.array[i] != outro.array[i]) {
                return false;
            }
        }
        return true;
    }
}
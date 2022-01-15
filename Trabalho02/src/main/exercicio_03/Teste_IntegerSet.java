package main.exercicio_03;

public class Teste_IntegerSet {

    public static void main(String arcs[]) {
        IntegerSet s1 = new IntegerSet();
        IntegerSet s2 = new IntegerSet();
        IntegerSet s3 = new IntegerSet();

        s1.inserirElemento(10);
        s1.inserirElemento(20);
        s1.inserirElemento(30);

        s2.inserirElemento(10);
        s2.inserirElemento(15);
        s2.inserirElemento(20);
        s2.inserirElemento(25);

        s3.inserirElemento(30);
        s3.inserirElemento(10);
        s3.inserirElemento(20);

        System.out.println("s1=" + s1.toSetString());
        System.out.println("s2=" + s2.toSetString());
        System.out.println("Interseção=" + s1.intersecao(s2).toSetString());
        System.out.println("União=" + s1.uniao(s2).toSetString());
        System.out.println("s1 e s2 iguais? " + s1.verificarIgualdade(s2));
        System.out.println("s1 e s3 iguais? " + s1.verificarIgualdade(s3));

    }
}

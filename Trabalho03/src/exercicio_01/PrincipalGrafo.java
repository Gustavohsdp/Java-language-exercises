package src.exercicio_01;

public class PrincipalGrafo {

    public static void main(String[] args) {

        Grafo grafo = new Grafo();
        // Criação dos vértices do grafo
        Grafo.Vertice v1 = grafo.adicionarVertice(1);
        Grafo.Vertice v2 = grafo.adicionarVertice(2);
        Grafo.Vertice v3 = grafo.adicionarVertice(3);
        Grafo.Vertice v4 = grafo.adicionarVertice(4);
        Grafo.Vertice v5 = grafo.adicionarVertice(5);
        Grafo.Vertice v6 = grafo.adicionarVertice(6);
        // Definição das arestas entre os vértices
        Grafo.Aresta V1V2 = grafo.adicionarAresta(v1, v2);
        Grafo.Aresta V1V5 = grafo.adicionarAresta(v1, v5);
        Grafo.Aresta V2V3 = grafo.adicionarAresta(v2, v3);
        Grafo.Aresta V3V1 = grafo.adicionarAresta(v3, v1);
        Grafo.Aresta V3V2 = grafo.adicionarAresta(v3, v2);
        Grafo.Aresta V5V3 = grafo.adicionarAresta(v5, v3);
        Grafo.Aresta V3V4 = grafo.adicionarAresta(v3, v4);
        Grafo.Aresta V3V5 = grafo.adicionarAresta(v3, v5);
        Grafo.Aresta V5V1 = grafo.adicionarAresta(v5, v1);
        Grafo.Aresta V2V4 = grafo.adicionarAresta(v2, v4);
        Grafo.Aresta V5V6 = grafo.adicionarAresta(v5, v6);
        Grafo.Aresta V6V1 = grafo.adicionarAresta(v6, v1);
        Grafo.Aresta V4V5 = grafo.adicionarAresta(v4, v5);
        Grafo.Aresta V4V1 = grafo.adicionarAresta(v4, v1);
        Grafo.Aresta V4V6 = grafo.adicionarAresta(v4, v6);
        Grafo.Aresta V6V2 = grafo.adicionarAresta(v6, v2);

        System.out.print(grafo);
        System.out.println("================================");
    }
}

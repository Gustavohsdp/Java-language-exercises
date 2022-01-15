package src.exercicio_01;

import java.util.List;
import java.util.ArrayList;

public class Grafo {

    List<Aresta> arestas;
    List<Vertice> vertices;

    // Criação das classes utilizadas pelo grafo
    public class Aresta {
        Vertice origem;
        Vertice destino;

        Aresta(Vertice origem, Vertice destino) {
            this.destino = destino;
            this.origem = origem;
        }
    }

    public class Vertice {

        int nome;
        List<Aresta> adjacencia;

        Vertice(int nome) {
            this.nome = nome;
            this.adjacencia = new ArrayList<Aresta>();
        }

        void adicionarAdjacencia(Aresta art) {
            adjacencia.add(art);
        }
    }

    public Grafo() {
        // Construtor do grafo
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();

    }

    Aresta adicionarAresta(Vertice origem, Vertice destino) {
        // Adicionar aresta ao grafo
        Aresta art = new Aresta(origem, destino);
        origem.adicionarAdjacencia(art);
        arestas.add(art);

        return art;
    }

    Vertice adicionarVertice(int nome) {
        // Adicionar vértice ao grafo
        Vertice vert = new Vertice(nome);
        vertices.add(vert);

        return vert;
    }

    public List getAresta() {
        return arestas;
    }

    public List getVertice() {
        return vertices;
    }

    public String toString() {
        // Exibir grafo completo com a lista de adjacência
        String espç = "";

        System.out.println("================================");
        System.out.println("Vértice ---> Lista de adjacência");
        System.out.println("================================");

        for (Vertice x : vertices) {

            espç += x.nome + " ---> ";

            for (Aresta art : x.adjacencia) {

                Vertice v = art.destino;
                espç += v.nome + ", ";

            }

            espç += "\n";
        }
        return espç;
    }

}

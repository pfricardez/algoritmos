package io.sewsol.algoritmos;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import io.sewsol.estructuras.*;

public class BreathFirstSearchTest {

    @Test
    public void busquedaPrimerNivel() {

        BreadthFirstSearch algoritmo = new BreadthFirstSearch();

        Graph grafo = new GraphBuilder().size(4)
            .vertex(List.of(1, 2))
            .vertex(List.of(1, 3))
            .vertex(List.of(2, 4))
            .vertex(List.of(2, 3))
            .build();

        boolean result = algoritmo.search(grafo, 1, 5);

        assertEquals(false, result, "Encuentra el valor");
    }

    @Test
    public void busquedaNumerosGrandes() {

        BreadthFirstSearch algoritmo = new BreadthFirstSearch();

        Graph grafo = new GraphBuilder().size(4)
            .vertex(List.of(100, 200))
            .vertex(List.of(200, 300))
            .vertex(List.of(200, 400))
            .vertex(List.of(200, 100))
            .build();

        boolean result = algoritmo.search(grafo, 200, 400);

        assertEquals(true, result, "Grafos de numeros grandes");
    }

    @Test
    public void caminoMasCorto() {

        BreadthFirstSearch algoritmo = new BreadthFirstSearch();
        
        Graph grafo = new GraphBuilder().size(5)
            .vertex(List.of(1, 2))
            .vertex(List.of(1, 3))
            .vertex(List.of(2, 4))
            .vertex(List.of(4, 5))
            .vertex(List.of(3, 5))
            .build();

        int result = algoritmo.getShortPath(grafo, 1, 5);

        assertEquals(2, result, "Camino mas corto");
    }

}

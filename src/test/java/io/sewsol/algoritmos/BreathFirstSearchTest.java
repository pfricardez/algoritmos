package io.sewsol.algoritmos;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import io.sewsol.estructuras.*;

public class BreathFirstSearchTest {

    @Test
    public void busquedaPrimerNivel() {

        BreadthFirstSearch algoritmo = new BreadthFirstSearch();

        Graph grafo = new Graph(4, List.of( List.of(1, 2), List.of(1, 3), List.of(2, 4), List.of(2, 3) ));

        boolean result = algoritmo.search(grafo, 1, 5);

        assertEquals(false, result, "Encuentra el valor");
    }

    @Test
    public void busquedaNumerosGrandes() {

        BreadthFirstSearch algoritmo = new BreadthFirstSearch();

        Graph grafo = new Graph(4, List.of( List.of(100, 200), List.of(200, 300), List.of(200, 400), List.of(200, 100) ));

        boolean result = algoritmo.search(grafo, 200, 400);

        assertEquals(true, result, "Grafos de numeros grandes");
    }

    @Test
    public void caminoMasCorto() {

        BreadthFirstSearch algoritmo = new BreadthFirstSearch();

        Graph grafo = new Graph(5, List.of( List.of(1, 2), List.of(1, 3), List.of(2, 4), List.of(4, 5), List.of(3, 5) ));

        boolean result = algoritmo.search(grafo, 1, 5);

        assertEquals(true, result, "Camino mas corto");
    }


    
}

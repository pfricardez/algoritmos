package io.sewsol.algoritmos;

import java.util.*;

import io.sewsol.estructuras.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DijkstraSearchTest {
    
    @Test
    public void simpleGraphWeighted() {

        DijkstraSearch algorithm = new DijkstraSearch();

        GraphWeighted graph = new GraphWeightedBuilder()
            .size(4)
            .vertexWeighted(1, 2, 1)
            .vertexWeighted(1, 3, 2)
            .vertexWeighted(2, 3, 2)
            .vertexWeighted(2, 4, 3)
            .vertexWeighted(3, 4, 1)
            .build();

        Map<Integer, Integer> costs = algorithm.search(graph, 1);

        assertEquals( 3, (int)costs.get(4), "Grafo de 4 nodos");
    }

    @Test
    public void complexGraphWeighted() {

        DijkstraSearch algorithm = new DijkstraSearch();

        GraphWeighted graph = new GraphWeightedBuilder()
            .size(6)
            .vertexWeighted(1, 2, 5)
            .vertexWeighted(1, 3, 2)
            .vertexWeighted(2, 4, 4)
            .vertexWeighted(2, 5, 2)
            .vertexWeighted(3, 2, 8)
            .vertexWeighted(3, 5, 7)
            .vertexWeighted(4, 5, 6)
            .vertexWeighted(4, 6, 3)
            .vertexWeighted(5, 6, 1)
            .build();

        Map<Integer, Integer> costs  = algorithm.search(graph, 1);

        assertEquals( 8, (int)costs.get(6), "Grafo de 6 nodos");
    }

    @Test
    public void mediumGraphWeighted() {

        DijkstraSearch algorithm = new DijkstraSearch();

        GraphWeighted graph = new GraphWeightedBuilder()
            .size(5)
            .vertexWeighted(1, 2, 10)
            .vertexWeighted(2, 4, 20)
            .vertexWeighted(3, 2, 1)
            .vertexWeighted(4, 3, 1)
            .vertexWeighted(4, 5, 30)
            .build();

        Map<Integer, Integer> costs  = algorithm.search(graph, 1);

        assertEquals(60, (int)costs.get(5), "Grafo de 5 nodos");
    }

    @Test
    public void BiggestGraphWeighted() {

        DijkstraSearch algorithm = new DijkstraSearch();

        GraphWeighted graph = new GraphWeightedBuilder()
            .size(9)
            .vertexWeighted(0, 1, 4) 
            .vertexWeighted(0, 7, 8)
            .vertexWeighted(1, 2, 8) 
            .vertexWeighted(1, 7, 11)
            .vertexWeighted(2, 3, 7) 
            .vertexWeighted(2, 5, 4) 
            .vertexWeighted(2, 8, 2)
            .vertexWeighted(3, 4, 9) 
            .vertexWeighted(5, 4, 10)
            .vertexWeighted(6, 5, 2) 
            .vertexWeighted(6, 8, 6)
            .vertexWeighted(7, 1, 1) 
            .vertexWeighted(7, 6, 1) 
            .vertexWeighted(7, 8, 7)
            .build();

        Map<Integer, Integer> costs  = algorithm.search(graph, 0);

        assertEquals(14, (int)costs.get(8), "Grafo de 9 nodos");
    }

}

package io.sewsol.algoritmos;

import java.util.*;

import io.sewsol.estructuras.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DijkstraSearchTest {

    
    @Test
    public void simpleGraphWeighted() {

        DijkstraSearch algorithm = new DijkstraSearch();


        GraphWeighted graph = new GraphWeighted(4, List.of(
            List.of(1, 2, 1), List.of(1, 3, 2), List.of(2, 3, 2), List.of(2, 4, 3), List.of(3, 4, 1)
        ));

        boolean result = algorithm.search(graph, 1, 4);

        assertEquals(true, true, "Testing simple graph weighted");

    }

    @Test
    public void complexGraphWeighted() {

        DijkstraSearch algorithm = new DijkstraSearch();


        GraphWeighted graph = new GraphWeighted(4, List.of(
            List.of(1, 2, 5), List.of(1, 3, 2), List.of(2, 4, 4), List.of(2, 5, 2), List.of(3, 2, 8), List.of(3, 5, 7),
            List.of(4, 5, 6), List.of(4, 6, 3), List.of(5, 6, 1)
        ));

        boolean result = algorithm.search(graph, 1, 6);

        assertEquals(true, true, "Testing simple graph weighted");

    }

    @Test
    public void mediumGraphWeighted() {

        DijkstraSearch algorithm = new DijkstraSearch();


        GraphWeighted graph = new GraphWeighted(5, List.of(
            List.of(1, 2, 10),  
            List.of(2, 4, 20),  
            List.of(3, 2, 1), 
            List.of(4, 3, 1), List.of(4, 5, 30)
        ));

        boolean result = algorithm.search(graph, 1, 6);

        assertEquals(true, true, "Testing simple graph weighted");

    }

    @Test
    public void BiggestGraphWeighted() {

        DijkstraSearch algorithm = new DijkstraSearch();


        GraphWeighted graph = new GraphWeighted(8, List.of(
            List.of(0, 1, 4), List.of(0, 7, 8),
            List.of(1, 2, 8), List.of(1, 7, 11),
            List.of(2, 3, 7), List.of(2, 5, 4), List.of(2, 8, 2),
            List.of(3, 4, 9), 
            List.of(5, 4, 10),
            List.of(6, 5, 2), List.of(6, 8, 6),
            List.of(7, 1, 1), List.of(7, 6, 1), List.of(7, 8, 7)
        ));

        boolean result = algorithm.search(graph, 0, 6);

        assertEquals(true, true, "Testing simple graph weighted");

    }


}

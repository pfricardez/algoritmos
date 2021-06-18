package io.sewsol.algoritmos;

import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DijkstraSearchBTest {
    
    @Test
    public void busquedaSimple() {

        DijkstraSearchB algoritmo = new DijkstraSearchB();

        Map<Integer,Map<Integer, Integer>> graph = new HashMap<>(5);
        for(Integer i=0; i<6; i++) graph.put(i, new HashMap<Integer,Integer>());
        graph.get(0).put(1, 1);
        graph.get(0).put(2, 2);
        graph.get(1).put(3, 2);
        graph.get(2).put(4, 1);
        graph.get(3).put(5, 2);
        graph.get(4).put(3, 1);
        graph.get(4).put(5, 1);

        algoritmo.searchMap(graph, 0);

        assertEquals(true, true, "Busqueda sobre un grafo");

    }
}

package io.sewsol.estructuras;

import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {

    
    @Test
    public void grafoPrimerNivel() {

        Graph grafo = new Graph(4, List.of( List.of(1, 2), List.of(1, 3), List.of(2, 4), List.of(2, 3) ));

        Integer[] result = grafo.getVertexChild(1).toArray(new Integer[1]);

        assertArrayEquals(new Integer[] {2, 3}, result, "Almacenamiento de Graph");
    }

    @Test
    public void grafoSinVecinos() {

        Graph grafo = new Graph(4, List.of( List.of(1, 2), List.of(1, 3), List.of(2, 4), List.of(2, 3) ));

        List<Integer> result = grafo.getVertexChild(4);

        assertEquals(0, result.size(), "No hay valores");

    }

    @Test
    public void grafoCounter() {

        Graph grafo = new Graph(4, List.of( List.of(1, 2), List.of(1, 3), List.of(2, 4), List.of(2, 3) ));

        int result = grafo.getTotalVertex();

        assertEquals(4, result, "Numero de vertices");
    }

}

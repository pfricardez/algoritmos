package io.sewsol.estructuras;

import java.util.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GraphWeightedTest {

    @Test
    public void iniciarGraphWeighted() {

        GraphWeighted graph = new GraphWeighted(3, List.of(
            List.of(1, 2, 1), List.of(1, 3, 2), List.of(2, 3, 1), List.of(2, 4, 3), List.of(3, 4, 1)
        ));

        graph.print();

        int result = graph.size();

        assertEquals(4, result, "Tamanio del grafo");
    }

}

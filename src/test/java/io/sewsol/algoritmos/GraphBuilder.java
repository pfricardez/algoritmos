package io.sewsol.algoritmos;

import java.util.*;
import io.sewsol.estructuras.*;

public class GraphBuilder {
    
    private int totalVertex;
    private List<List<Integer>> vertex;

    public GraphBuilder() {
        totalVertex = 5;
        vertex = new ArrayList<List<Integer>>();
    }

    public GraphBuilder vertex(List<Integer> relationship) {
        vertex.add(relationship);
        return this;
    }

    public GraphBuilder size(int size) {
        totalVertex = size;
        return this;
    }

    public Graph build() {
        return new Graph(totalVertex, vertex);
    }
}

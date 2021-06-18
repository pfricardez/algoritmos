package io.sewsol.algoritmos;

import java.util.*;
import io.sewsol.estructuras.*;

public class GraphWeightedBuilder {

    private int noVertex;

    private List<List<Integer>> vertex;

    public GraphWeightedBuilder() {
        noVertex=5;
        vertex = new ArrayList<>(10);
    }
    
    public GraphWeightedBuilder size(int size) {
        noVertex = size;
        return this;
    }

    public GraphWeightedBuilder vertexWeighted(Integer nodeA, Integer nodeB, Integer weight) {
        vertex.add( List.of(nodeA, nodeB, weight) );
        return this;
    }

    public GraphWeighted build() {
        return new GraphWeighted(noVertex, vertex);
    }

}

package io.sewsol.algoritmos;

import io.sewsol.estructuras.Graph;

import java.util.*;

/**
 * Este algoritmo de busqueda en grafo de complejidad O(v + e)
 * v = vertex
 * e = edges
 */
public class BreadthFirstSearch {
    
    public boolean  search(Graph graph, Integer origin, Integer target) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(origin);

        Set<Integer> visited = new HashSet<>(graph.getTotalVertex());

        Integer inspected = null;

        while( (inspected = deque.poll()) != null ) {
            
            if ( !visited.contains(inspected) ) {

                visited.add(inspected);

                if (inspected.equals(target))   return true;
                
                deque.addAll(graph.getVertexChild(inspected));
                
            }

        }

        return false;

    }

    public int getShortPath(Graph graph, Integer origin, Integer target) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(origin);

        Deque<Integer> levels = new ArrayDeque<>();
        levels.add(0);

        Set<Integer> visited = new HashSet<>(graph.getTotalVertex());

        Integer inspected = null;

        while( (inspected = deque.poll()) != null ) {

            int currentLevel = levels.poll();
            
            if ( !visited.contains(inspected) ) {

                visited.add(inspected);

                if (inspected.equals(target))   {
                    return currentLevel;
                }
                
                List<Integer> neibor = graph.getVertexChild(inspected);
                deque.addAll(neibor);

                currentLevel++;
                for (Integer nei : neibor) {
                    levels.add(currentLevel);
                }    
                
            }

        }

        return -1;

    }

}

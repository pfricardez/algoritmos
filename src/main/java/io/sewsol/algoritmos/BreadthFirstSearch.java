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

        System.out.println("Search :" + target + " From Node : " + origin);
        graph.print();

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(origin);

        Map<Integer, Boolean> visited = new HashMap<>(graph.getTotalVertex());

        Integer inspected = null;

        while( (inspected = deque.poll()) != null ) {
            System.out.println("Inspeccionado: " + inspected);
            if ( !visited.containsKey(inspected) ) {

                if (inspected.equals(target)) {
                    System.out.println("Target found");
                    return true;
                }
                List<Integer> child = graph.getVertexChild(inspected);
                if (child.size() > 0) {                
                    deque.addAll(child);
                    System.out.println("No encontrado, agrega hijos:" + Arrays.toString( child.toArray(new Integer[0]) ));                
                }
                else {
                    System.out.println("No encontrado, no es parte de la ruta");
                }
                
                visited.put(inspected, true);
            }
            else {
                System.out.println("Ya fue inspeccionado el vertex:" + inspected);
            }

        }

        System.out.println("Targe not found");
        return false;

    }

}

package io.sewsol.estructuras;

import java.util.*;

public class Graph {

    private HashMap<Integer, List<Integer>> nodos;

    public Graph(int vertex, List<List<Integer>> pairs) {

        nodos = new HashMap<>(vertex);

        for(int i=0; i<pairs.size(); i++) {

            List<Integer> r = pairs.get(i);

            Integer key = r.get(0);
            Integer neiborgh = r.get(1);

            addVertext(key);
            addVertext(neiborgh);
            addVertexChild(key, neiborgh);

        }
    }

    private void addVertext(Integer v) {
        if ( !nodos.containsKey(v) ) {
            nodos.put(v,  new ArrayList<>());
        }
    }

    private void addVertexChild(Integer v, Integer child) {
        nodos.get(v).add(child);
    }

    public int getTotalVertex() { 
        return nodos.size();
    }

    public List<Integer> getVertexChild(Integer v) {
        if (nodos.containsKey(v)) return nodos.get(v);
        else return new ArrayList<>();
    }

    public void print() {

        Set<Integer> vertex = nodos.keySet();
        for(Integer v : vertex) {
            List<Integer> childs = nodos.get(v);
            StringBuffer sb = new StringBuffer();
            childs.forEach( x -> sb.append(x+ " "));
            System.out.println("Nodo: " + v + ", relationship: " + sb.toString()) ;
        }

    }
    
}

package io.sewsol.estructuras;

import java.util.*;

public class GraphWeighted {

    public static class Node {
        int value;
        int weight;

        public Node(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        public int getValue() { return value; }
        public int getWeight() { return weight; }

        @Override
        public int hashCode() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if ( obj != null && obj.getClass().equals(this.getClass()))
                return ((Node)obj).value == this.value;

            return false;
        }

        @Override
        public String toString() {
            return "Node[Value="+value+", Weight="+weight+"]";
        }

    }

    Map<Node, List<Node>> vertex;

    public GraphWeighted(int nodes, List<List<Integer>> pairs) {

        vertex = new HashMap<>(nodes);

        for(int i=0; i<pairs.size(); i++) {

            List<Integer> pair = pairs.get(i);

            Integer p = pair.get(0);
            Integer c = pair.get(1);
            Integer weight = pair.get(2);

            Node father = new Node(p, 0);
            Node child = new Node(c, 0);
            addNode(father);
            addNode(child);
            addChild(father, child, weight);

        }

    }

    private void addNode(Node n) {
        if (!vertex.containsKey(n)) vertex.put(n, new ArrayList<Node>());
    }

    private void addChild(Node n, Node child, Integer weight) {
        if (vertex.containsKey(n)) vertex.get(n).add(new Node(child.getValue(), weight));
    }

    public int size() { return vertex.size(); }

    public List<Node> getChildren(Node n) {
        if (vertex.containsKey(n)) return vertex.get(n);
        else return new ArrayList<Node>();
    }

    public List<Node> getChildren(Integer a) {
        
        Set<Node> nodes = vertex.keySet();

        for(Node n : nodes)
            if (n.getValue()==a) return vertex.get(n);
        
        return new ArrayList<Node>();

    }

    public Set<Node> getVertex() {
        if ( vertex!=null) return vertex.keySet();
        else return null;
    }

    public void print() {
        Set<Node> nodos = vertex.keySet();
        for(Node v : nodos) {
            List<Node> childs = vertex.get(v);
            StringBuffer sb = new StringBuffer();
            childs.forEach( x -> sb.append( "("+x.getValue()+ ":" + x.getWeight() + ") "));
            System.out.println("Nodo: " + v.getValue() + ", relationship: " + sb.toString()) ;
        }

    }    
    
}

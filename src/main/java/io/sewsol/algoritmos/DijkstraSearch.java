package io.sewsol.algoritmos;

import java.util.*;

import io.sewsol.estructuras.*;
import io.sewsol.estructuras.GraphWeighted.Node;

public class DijkstraSearch {

    public boolean  search(GraphWeighted graph, Integer a, Integer b) {


        Map<Integer, Integer> costs = new HashMap<>(graph.size()); 
        Map<Integer, Integer> parents = new HashMap<>(graph.size());
        Set<Integer> visited = new HashSet<>(graph.size());

        initParents(graph, parents, a);
        initCosts(graph, costs, a);
        printCosts(costs);
        printParents(parents);

        Integer node = findLowestNode(costs, visited);
        System.out.println("LowestNode:" + node);
        while(node!=null) {
            Integer cost = costs.get(node);

            List<Node> neighbors = graph.getChildren(node);
            for(Node n : neighbors) {
                Integer newCost = cost + n.getWeight();
                if (costs.get(n.getValue())> newCost) {
                    costs.replace(n.getValue(), newCost);
                    parents.replace(n.getValue(), node);
                }
            }
            printCosts(costs);
            printParents(parents);
            visited.add(node);
            node = findLowestNode(costs, visited);
            System.out.println("LowestNode:" + node);
        }

        return false;


    }

    private void printCosts(Map<Integer, Integer> costs) {

        System.out.println("Current Costs");
        for(Integer n : costs.keySet())
            System.out.println("Node:" + n + " Cost:" + costs.get(n));

    }

    private void printParents(Map<Integer, Integer> parents) {

        System.out.println("Current Parents");
        for(Integer n : parents.keySet())
            System.out.println("Node:" + n + " Parent:" + parents.get(n));

    }


    protected Integer findLowestNode(Map<Integer, Integer> costs,  Set<Integer> visited) {
        
        Integer lowestCost = Integer.MAX_VALUE;
        Integer lowestNode = null;
        Set<Integer> nodes = costs.keySet();
        for(Integer node : nodes)
            if( !visited.contains(node) && costs.get(node) < lowestCost ) {
                lowestCost = costs.get(node);
                lowestNode = node;
            }

        return lowestNode;

    }

    protected void initCosts(GraphWeighted graph, Map<Integer, Integer> costs, Integer o) {

        Set<Node> vertex = graph.getVertex();
        if (vertex!=null)
            for(Node n : vertex) 
                costs.put(n.getValue(), Integer.MAX_VALUE);

        costs.remove(o);

        List<Node> neighbor = graph.getChildren(o);
        for(Node n : neighbor)
            costs.replace(n.getValue(), n.getWeight());
        
    }

    protected void initParents(GraphWeighted graph, Map<Integer, Integer> parents, Integer o) {

        Set<Node> vertex = graph.getVertex();
        if (vertex!=null)
            for(Node n : vertex) 
                parents.put(n.getValue(), null);

        parents.remove(o);

        List<Node> neighbor = graph.getChildren(o);
        for(Node n : neighbor)
            parents.replace(n.getValue(), o);
        
    }

}

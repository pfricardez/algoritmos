package io.sewsol.algoritmos;

import java.util.*;
import java.util.stream.Collectors;

public class DijkstraSearchB {

    public void searchMap(Map<Integer, Map<Integer, Integer>> graph, Integer origin) {

        Map<Integer, Integer> costs = new HashMap<>(graph.size());
        Map<Integer, Integer> parents = new HashMap<>(graph.size());
        Set<Integer> visited = new HashSet<>(graph.size());

        //Setup
        graph.keySet().stream().forEach(x -> {
            costs.put(x, Integer.MAX_VALUE);
            parents.put(x, null);
        });

        visited.add(origin);
        Map<Integer, Integer> originChilds = graph.get(origin);
        originChilds.keySet().stream().forEach(x -> {
            costs.replace(x, originChilds.get(x));
            parents.replace(x, origin);
        });

        Integer inspected = getCheapestNode(costs, visited);
        Map<Integer, Integer> inspectedNei = null;
        Integer inspectedCost = null;
        Integer newCost = null;
        while( inspected != null ) {
            inspectedCost = costs.get(inspected);
            inspectedNei = graph.get(inspected);
            for(Integer node : inspectedNei.keySet()) {
                newCost = inspectedNei.get(node) + inspectedCost;
                if (costs.get(node) > newCost) {
                    costs.replace(node, newCost);
                    parents.replace(node, inspected);
                }
            }
            visited.add(inspected);
            inspected = getCheapestNode(costs, visited);
        }

        //print results
        parents.keySet().stream().forEach( x -> System.out.println("Node: "+x+" Parent:" + parents.get(x) + " Final Cost:"+ costs.get(x))) ;
    }

    protected Integer getCheapestNode(Map<Integer, Integer> costs,  Set<Integer> visited ) {
        Integer cheapestCost = Integer.MAX_VALUE;
        Integer cheapestNode = null;
        List<Integer> nodes = costs.keySet().stream().filter(x -> !visited.contains(x)).collect(Collectors.toList());
        for(Integer node : nodes) 
            if ( costs.get(node) < cheapestCost ) {
                cheapestCost = costs.get(node);
                cheapestNode = node;
            }
        
        return cheapestNode;
    }
    
}

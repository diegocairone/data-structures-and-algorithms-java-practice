package com.cairone.rooftop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphChallange {

    public static String graphChallenge(String[] strArr) {
        int numNodes = Integer.parseInt(strArr[0]);
        Graph graph = new Graph(numNodes);

        for (int i = 0; i <= numNodes; i++) {
            graph.addEdge(strArr[i], strArr[i]);
        }

        for (int i = numNodes + 1; i < strArr.length; i++) {
            String[] edge = strArr[i].split("-");
            graph.addEdge(edge[0], edge[1]);
        }

        return graph.shortenPath(strArr[1], strArr[numNodes]);
    }

    public static class Graph {

        private int numNodes;
        private Map<String, List<String>> adjList;

        public Graph(int numNodes) {
            this.numNodes = numNodes;
            this.adjList = new HashMap<>();
        }

        public void addEdge(String source, String destination) {
            adjList.putIfAbsent(source, new ArrayList<>());
            adjList.get(source).add(destination);
        }

        public String shortenPath(String start, String end) {
            if (!adjList.containsKey(start) || !adjList.containsKey(end)) {
                return "-1";
            }

            Set<String> visited = new HashSet<>();
            Queue<String> queue = new LinkedList<>();
            Map<String, String> parent = new HashMap<>();

            queue.add(start);
            visited.add(start);

            while (!queue.isEmpty()) {
                String current = queue.poll();
                if (current.equals(end)) {
                    StringBuilder path = new StringBuilder(end);
                    while (current != start) {
                        current = parent.get(current);
                        path.insert(0, current + "-");
                    }
                    return path.toString();
                }

                for (String neighbord : adjList.getOrDefault(current, Collections.emptyList())) {
                    if (!visited.contains(neighbord)) {
                        visited.add(neighbord);
                        queue.add(neighbord);
                        parent.put(neighbord, current);
                    }
                }
            }
            return "-1";
        }
    }

    public static void main(String[] args) {
        //String rv = graphChallenge(new String[] {"5","A","B","C","D","F","A-B","A-C","B-C","C-D","D-F"});
        //String rv = graphChallenge(new String[] {"4","A","B","C","D","A-B","B-D","B-C","C-D"});
        String rv = graphChallenge(new String[] {"7","A","B","C","D","E","F","G","A-B","A-E","B-C","C-D","D-F","E-D","F-G"});
        System.out.println(rv);
    }

}

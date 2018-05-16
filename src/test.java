public class test {
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,1);
        graph.addEdge(1,1);
        graph.addEdge(1,5);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);

        System.out.println(degree(graph, 1));
        System.out.println(maxDegree(graph));
        System.out.println(numberOfSelfLoops(graph));
    }

    // compute the degree of v
    public static int degree(UndirectedGraph G, int v) {
        int degree = 0;
        for(int w: G.adj(v)) degree++;
        return degree;
    }

    // compute maximum degree
    public static int maxDegree(UndirectedGraph G) {
        int max = 0;
        for (int v = 0; v < G.V(); v++)
            if (degree(G, v) > max)
                max = degree(G, v);
        return max;
    }

//    // compute average degree
//    public static double averageDegree(UndirectedGraph G){
//        return 2.0 * G.V() / G.E();
//    }

    // count self-loops
    public static int numberOfSelfLoops(UndirectedGraph G) {
        int count = 0;
        for (int v = 0; v < G.V(); v++)
            for (int w: G.adj(v))
                if (v == w) count++;
        return count/2;
    }
}

public class test {
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,1);
        graph.addEdge(1,5);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        for (int each: graph.adj_iterator(1)) {
            System.out.println(each);
        }
    }
}

// performing BreadthFirstSearch 
import java.util.*;

class BreadthFirstSearch{

    // creating Edge class to store the Edge info..
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;

        }
    }

    // creating the function createGraph to make the graph 

    static void createGraph(ArrayList<Edge> graph []){
        for(int i =0; i<graph.length; i++){
            graph [i] = new ArrayList<>();

        }
        // assigning the edge into the graph..
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));

    }


    // function for performing the BFS
    static void breadthFirstSearch(ArrayList<Edge> graph [], int v, int start){
        // creating queue to store the node 
        Queue <Integer> q = new LinkedList<>();
        // creating the boolean vist [] to mark as visited..
        boolean vist [] = new boolean [v];

        // push the start into the queue..
        q.add(start);

        while(!q.isEmpty()){
            // remove from the queue
            int cur = q.remove();
            if(!vist[cur]){
                System.out.print(cur+" ");
                // mark them visited..
                vist [cur] = true;

                // add their neighbor into the queue..
                for(int i =0; i<graph[cur].size(); i++){
                    Edge e = graph[cur].get(i);
                    // push into the queue..
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String [] args){
        int v = 7;
        ArrayList <Edge> graph [] = new ArrayList [v];
        int start = 3;
        // calling the function to create the graph.
        createGraph(graph);

        System.out.println("Breadth First Search Traversal of the grpah: ");
        //performing the breadth first search.
        breadthFirstSearch(graph, v, start);
    }
}

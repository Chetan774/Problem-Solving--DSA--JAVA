import java.util.*;


public class Graph_Using_AdjancyList
{
    public static  class edge
    {
        int src;
        int dest;

        edge(int src, int dest)
        {
            this.src = src;
            this.dest = dest;
        }
    }



    public static void bfs(ArrayList<edge> graph[])
    {
        Queue<Integer> q = new LinkedList<>();

        boolean vis[] = new boolean[graph.length];

        q.add(0);

        while(! q.isEmpty())
        {
            int curr  = q.remove();

            if(!vis[curr])
            {
                vis[curr] = true;
                System.out.print(curr+" ");

                for(int i = 0; i < graph[curr].size(); i++)
                {
                    edge e = graph[curr].get(i);
                    q.add(e.dest);
                }

            }
        }
    }


    public static void dfs(ArrayList<edge> graph[], int curr, boolean vis[])
    {
        System.out.print(curr+" ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++)
        {
            edge e = graph[curr].get(i);

            if(! vis[e.dest])
            {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args)
    {
        int v = 7;

        ArrayList<edge> graph[] = new ArrayList[v];

        for(int i =0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));


        graph[5].add(new edge(5, 4));
        graph[5].add(new edge(5, 6));


        System.out.println("BFS : ");
        bfs(graph);

        System.out.println();
        boolean vis[] = new boolean[v];

        System.out.println("DFS : ");
        dfs(graph, 0,vis );
    }






}

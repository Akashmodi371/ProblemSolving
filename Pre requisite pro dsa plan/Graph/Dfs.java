import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dfs {
    void Dfs(int node,List<Integer>[] graph,int[] used,int[] parent){
        System.out.println(node);
        used[node]=1;

        for(int i:graph[node]){
            if(used[i]==0){
                parent[i]=node;
                Dfs(i, graph, used, parent);
            }
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Rows:");
        int row=sc.nextInt();
        System.out.println("Enter Columns");
        int col=sc.nextInt();

        List<Integer>[] graph=new ArrayList[row+1];
        int[] used=new int[row+1];
        Arrays.fill(used, 0);
        int[] parent=new int[row+1];

        for(int i=1;i<=row;i++){
            graph[i]=new ArrayList<>();
        }
        int i=1;
        while(i<=col){
            int x=sc.nextInt();
            int y=sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
            i++;
        }

        Dfs(1,graph,used,parent);
    }
    

}

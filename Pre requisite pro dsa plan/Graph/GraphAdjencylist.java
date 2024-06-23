import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphAdjencylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Rows:");
        int row=sc.nextInt();
        System.out.println("Enter Columns");
        int edge=sc.nextInt();

        ArrayList<Integer>[] g=new ArrayList[row+1];

        for(int i=1;i<=row;i++){
            g[i]=new ArrayList<>();
        }

        for(int j=1;j<=edge;j++){
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();

            g[x].add(y);
            g[y].add(x);
        }


       int source=1;
       int[] visited=new int[row+1];
       Arrays.fill(visited, 0);
       visited[source]=1;
        
       int[] level=new int[row+1];
       level[source]=0;
       Queue<Integer> q=new LinkedList<>();

       q.add(source);

       while(!q.isEmpty()){
        int remove=q.peek();
        q.remove();
    

        System.out.println(remove+"->");
        for(int a:g[remove]){
            if(visited[a]==0){
                level[a]=level[remove]+1;
                visited[a]=1;
                q.add(a);
            }
        }
       }

       for(int i=1;i<=row;i++){
        System.out.println(level[i]);
       }


        
    }
}

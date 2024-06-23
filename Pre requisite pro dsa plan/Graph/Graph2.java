import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Graph2 {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Rows:");
        int row=sc.nextInt();
        System.out.println("Enter Columns");
        int col=sc.nextInt();

        List<Integer>[] graph=new ArrayList[row+1];

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

        int s=sc.nextInt();

        Queue<Integer> q=new LinkedList<>();
        int[] vis=new int[row+1];
        int source=s;
        q.add(source);
        Arrays.fill(vis, -1);
        vis[source]=1;
        int[] dis=new int[row+1];
        dis[source]=0;
        int[] shortdis=new int[row+1];
        shortdis[source]=1;
        Arrays.fill(dis, 0);
        while(!q.isEmpty()){

            



            int remove=q.peek();
            q.remove();

            for(int a:graph[remove]){
                if(vis[a]==-1){
                    dis[a]=dis[remove]+1;
                    shortdis[a]=shortdis[remove];
                    q.add(a);
                    vis[a]=1;
                }
                else{
                    if(dis[remove]+1==dis[a]){
                        shortdis[a]=shortdis[a]+shortdis[remove];
                    }
                    else{
                        continue;
                    }
                }
            }
        }


        i=1;
        while(i<=row){
            System.out.println(shortdis[i]);
            i++;
        }
    }
}

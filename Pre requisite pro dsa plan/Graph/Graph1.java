//take input for graph in matrix

import java.util.Scanner;

public class Graph1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Rows:");
        int row=sc.nextInt();
        System.out.println("Enter Columns");
        int col=sc.nextInt();

        int[][] graph=new int[row+1][col+1];

        int i=1;
        while(i<=row){
            int j=1;
            while(j<=col){
                graph[i][j]=sc.nextInt();
                j++;
            }
            i++;
        }

        i=1;
        while(i<=row){
            int j=1;
            while(j<=col){
                System.out.print(graph[i][j]);
                System.out.print(" ");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
package com.algorithm.dfs;

public class minPath {
    static int shortestPath(int [][] matrix){
        if(matrix[0][0]!=0)
            return -1;
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];
        return shortPath(matrix,0,0,0,visited);
    }
    static int shortPath(int [][] matrix,int i,int j,int num,boolean[][] visited){
        int min = 0;
        if(i<0||i>=matrix.length||j<0||j>=matrix[i].length||matrix[i][j]!=0)
            return -1;
        if(num==-1||visited[i][j])
            return -1;
        if(i ==matrix.length-1&&j==matrix[i].length-1&&matrix[i][j]==0)
            return num + 1;
        visited[i][j] = true;
        min = Math.min(Math.min(shortPath(matrix,i+1,j,num+1,visited)==-1?Integer.MAX_VALUE:shortPath(matrix,i+1,j,num+1,visited),
                        shortPath(matrix,i-1,j,num+1,visited)==-1?Integer.MAX_VALUE:shortPath(matrix,i-1,j,num+1,visited)),
                Math.min(shortPath(matrix,i,j+1,num+1,visited)==-1?Integer.MAX_VALUE:shortPath(matrix,i,j+1,num+1,visited),
                        shortPath(matrix,i,j-1,num+1,visited)==-1?Integer.MAX_VALUE:shortPath(matrix,i,j-1,num+1,visited)));
        visited[i][j] = false;
        return min==Integer.MAX_VALUE?-1:min;
    }
    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0,0,0,0},
                {1,1,1,0},
                {1,1,0,0},
                {1,1,1,1},
                {1,1,0,0}
        };
        System.out.println(shortestPath(grid));
    }
}

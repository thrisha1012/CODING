class Solution {
    public void dfs(int node,ArrayList<ArrayList<Integer>>adj,int[]visited){
        visited[node]=1;
        for(int a:adj.get(node)){
            if(visited[a]==0){
                dfs(a,adj,visited);
            }
        }
    }
    public int findCircleNum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<m;i++){
            adj.add(new ArrayList<>());
        }
        //convert 2d matrix into adj list
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 &&i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int visited[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                count++;
                dfs(i,adj,visited);
            }
        }
        return count;
    }
}
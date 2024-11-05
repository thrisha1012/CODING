class Pair{ //because we r trying to store the nodes in the form of row nd col
    int row;
    int col;
    Pair(int r,int c){
        this.row=r;
        this.col=c;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<Pair>q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        int [][]visited=new int[m][n];
        //for row boundary
        for(int i=0;i<n;i++){
            if(grid[0][i]==1){ //first row
                q.offer(new Pair(0,i));
                visited[0][i]=1;
            }
            if(grid[m-1][i]==1){ //last row
                q.offer(new Pair(m-1,i));
                visited[m-1][i]=1;
            }   
        }
        //for col
        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && visited[i][0]==0){ //first col
                q.offer(new Pair(i,0));
                visited[i][0]=1;
            }
            if(grid[i][n-1]==1 && visited[i][n-1]==0){ //last col
                q.offer(new Pair(i,n-1));
                visited[i][n-1]=1;
            }    
            
        }

        int []drow={-1,0,1,0};
        int []dcol={0,1,0,-1};
        //bfs
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            q.poll(); //pop
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    visited[nrow][ncol]=1;
                    q.offer(new Pair(nrow,ncol));
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}
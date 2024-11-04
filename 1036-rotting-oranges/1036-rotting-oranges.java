class Pair{
    int row;
    int col;
    int level;
    Pair(int r,int c,int l){
        this.row=r;
        this.col=c;
        this.level=l;
    } //Pair(2,3,9) (row,col,lvl) //i,j ->nodes and last one is level
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair>q=new LinkedList<>(); 
        int m=grid.length;
        int n=grid[0].length;
        int[][] visited=new int[m][n];
        int fresh=0;
//loop is for -> wherenever we find the rotten orange we need to insert that into queue
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new Pair(i,j,0));
                    visited[i][j]=1;
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int max_level=0;
        int []drow={0, 1, 0, -1}; //right,down,left,up ->row
        int []dcol={1, 0, -1, 0}; //right,down,left,up ->col
        while(!q.isEmpty()){
            //peek will just show the peek element
            //poll will  pop out the lst element
            int r=q.peek().row;
            int c=q.peek().col;
            int curr_level=q.peek().level;
            q.poll(); 
            max_level=Math.max(curr_level,max_level);
            for(int i=0;i<4;i++){
                int nrow=r + drow[i];
                int ncol=c + dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && visited[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.offer(new Pair(nrow,ncol,curr_level+1));
                    visited[nrow][ncol]=1;
                    fresh--;
                }
            }
        }
        return (fresh==0)?max_level:-1;
        
    }
}
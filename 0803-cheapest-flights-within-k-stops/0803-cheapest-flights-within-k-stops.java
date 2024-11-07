class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int e=flights.length;
        int dist[]=new int[n];

        for(int i=0;i<n;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        for(int i=0;i<=k;i++){
            int temp[]=Arrays. copyOf(dist,n);
            for(int j=0;j<e;j++){
                int u=flights[j][0];
                int v=flights[j][1];
                int w=flights[j][2];
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+w < temp[v]){
                    temp[v]=dist[u]+w;
                }
            }
            dist=temp;
        }
        return dist[dst]==Integer.MAX_VALUE ? -1:dist[dst];
        
    }
}
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int dif=0;
        for(int i=0;i<seats.length;i++){
            dif=dif+Math.abs(seats[i]-students[i]);
            
        }
        return dif;
        
    }
}
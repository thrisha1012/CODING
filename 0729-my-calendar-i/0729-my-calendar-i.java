class MyCalendar {
    List<int[]>list=new ArrayList<>();
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        for(int i=0;i<list.size();i++){
            int b[]=list.get(i);
            int bs=b[0];
            int be=b[1];
            if(start<be && end>bs){
                return false;
            }
        }
        list.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
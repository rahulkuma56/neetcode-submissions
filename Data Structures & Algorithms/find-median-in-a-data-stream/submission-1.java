class MedianFinder {
    List<Integer> list = new ArrayList<Integer>();
    int sum = 0;

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        list.add(num);
        sum += num;
        Collections.sort(list);
    }
    
    public double findMedian() {
        if(list.size()%2 == 0){
            int m = (list.size()/2);
            return  (double) (list.get(m)+list.get(m-1))/2.0;
        }else{
            return (double) (list.get((list.size()/2)));
        }
        //return (double)sum/(double)list.size();
        
    }
}

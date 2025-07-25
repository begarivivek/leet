class MedianFinder {

    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue<>();
    
    public void addNum(int num) {
        //1.insert
        if(max.size() == 0 || num <= max.peek())  
                max.add(num);
        else
            min.add(num);
        
        // 2. balancing

        int left = max.size() , right = min.size();

        int diff = left - right;

        if(diff == -1 || diff == -2)
                max.add(min.remove());
        else if(diff == 2)
                min.add(max.remove());
    }
    
    public double findMedian() {
        if(max.size() == min.size()) 
               return (max.peek()+min.peek())/2.0;
        else 
            return (double)max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
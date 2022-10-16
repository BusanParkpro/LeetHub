class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>();
        
        for (int i = 0; i < nums1.length; i++) {
            if (maxQueue.size() < minQueue.size()) {
                maxQueue.add(nums1[i]);
            } else {
                minQueue.add(nums1[i]);
            }
            
            if (!minQueue.isEmpty() && !maxQueue.isEmpty()) {
                if (minQueue.peek() > maxQueue.peek()) {
                    int temp = minQueue.poll();
                    minQueue.add(maxQueue.poll());
                    maxQueue.add(temp);
                }
            }
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (maxQueue.size() < minQueue.size()) {
                maxQueue.add(nums2[i]);
            } else {
                minQueue.add(nums2[i]);
            }
            
            if (!minQueue.isEmpty() && !maxQueue.isEmpty()) {
                if (minQueue.peek() > maxQueue.peek()) {
                    int temp = minQueue.poll();
                    minQueue.add(maxQueue.poll());
                    maxQueue.add(temp);
                }
            }
        }
        
        if(maxQueue.size() == minQueue.size()) {
            return (maxQueue.poll() + minQueue.poll()) / 2.0;
        } else if (maxQueue.size() > minQueue.size()) {
            return (double) maxQueue.poll();
        } else {
            return (double) minQueue.poll();
        }
        
    }
}
class Solution {
    public double average(int[] salary) {
        double sum = 0;
        int cnt = 0;
        Arrays.sort(salary);
        
        for(int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
            ++cnt;
        }
        return sum / cnt;    
    }
}
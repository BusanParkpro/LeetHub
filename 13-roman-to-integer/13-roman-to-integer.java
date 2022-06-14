import java.util.*;

class Solution {       
    private static Map<Character, Integer> m = new HashMap<>();
    static {
    m.put('I', 1);
    m.put('V', 5);
    m.put('X', 10);
    m.put('L', 50);
    m.put('C', 100);
    m.put('D', 500);
    m.put('M', 1000);
}

    
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int sum = 0;
        
        for(int i = 0; i < c.length; i++) {
            if(i > 0 && m.get(c[i]) > m.get(c[i - 1])) {
                sum += m.get(c[i]) - 2*m.get(c[i - 1]);
            } else {
                sum += m.get(c[i]);
        }    
    }
    return sum;
    }
}
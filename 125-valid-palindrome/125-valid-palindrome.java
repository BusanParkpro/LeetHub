class Solution {
    public boolean isPalindrome(String s) {
        int x = 0;
        int y = s.length() -1;
        
        while (x < y) {
            while (x < s.length() && !isAlphanumeric(s.charAt(x))) {
                x++;
            }
            while (y >= 0 && !isAlphanumeric(s.charAt(y))) {
                y--;
            }
            if (x == s.length() || y == -1)
                return true;
            char a = Character.toUpperCase(s.charAt(x));
            char b = Character.toUpperCase(s.charAt(y));
            if (a != b) 
                return false;
            x++;
            y--;
        }
        return true;
    }
    private Boolean isAlphanumeric(char a) {
        return (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || (a >= '0' && a <= '9');
    }
}
class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1)
            return s;

        String answer = "";

        for(int i = 0; i < numRows; ++i){
            for(int j = i, cnt = 0; j < s.length(); ++cnt){
                answer += s.charAt(j);
                int offset = 2 * numRows - 2;
                if(i != 0 && i != (numRows - 1)){
                    if(cnt % 2 == 0){
                        offset -= (2 * i);
                    }
                    else{
                        offset = 2 * i;
                    }
                }
                j += offset;
            }
        }
        return answer;
    }
}
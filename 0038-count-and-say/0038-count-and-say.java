class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String[] resultArr = new String[n + 1];
        int count;
        String pastNum, curDigit, nextDigit;

        resultArr[1] = "1";
        for (int i = 2; i <= n; i++) {
            count = 1;
            resultArr[i] = "";
            pastNum = resultArr[i - 1];
            if (i == 2) {
                resultArr[i] += count + Character.toString(resultArr[1].charAt(0));
            }
            for (int j = 0; j < pastNum.length() - 1; j++) {
                curDigit = Character.toString(pastNum.charAt(j));
                nextDigit = Character.toString(pastNum.charAt(j + 1));
                if (curDigit.equals(nextDigit)) {
                    count++;
                    if (j == pastNum.length() - 2) {
                        resultArr[i] += count + curDigit;
                    }
                } else {
                    resultArr[i] += count + curDigit;
                    count = 1;
                    if (j == pastNum.length() - 2) {
                        resultArr[i] += count + nextDigit;
                    }
                }
            }
        }
        return resultArr[n];
    }
}
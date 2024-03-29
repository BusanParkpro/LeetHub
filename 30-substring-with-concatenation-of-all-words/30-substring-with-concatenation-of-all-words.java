public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        LinkedList<Integer> res = new LinkedList<>();
        int n = words.length; // the number words
        int l = words[0].length(); // the length of each word
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) { // build map
            int val = 1;
            if (map.containsKey(word)) {
                val += map.get(word);
            }
            map.put(word, val);
        }
        for (int i = 0; i + n * l - 1 < s.length(); i++) {
            HashMap<String, Integer> tmp = (HashMap<String, Integer>) map.clone();
            for (int j = 0; j < n; j++) {
                String str = s.substring(i + j * l, i + (j + 1) * l);
                if (tmp.containsKey(str)) {
                    int val = tmp.get(str);
                    if (val > 1) {
                        tmp.put(str, val - 1);
                    } else {
                        tmp.remove(str);
                    }
                } else {
                    break;
                }
            }
            if (tmp.size() == 0) {
                res.add(i);
            }
        }
        return res;
    }
}
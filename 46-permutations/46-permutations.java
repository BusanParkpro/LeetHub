class Solution {
    public void solve(List<List<Integer>> answer, int[] nums, List<Integer> cur) {
        if (cur.size() == nums.length) {
            answer.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (cur.contains(num)) {
                continue;
            }
            cur.add(num);
            solve(answer, nums, cur);
            cur.remove((Integer) num);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        solve(answer, nums, new ArrayList<>());
        return answer;
    }
}
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        this.result = new ArrayList<>();
        helper(nums, 0 , new ArrayList<>());
        return result;
    }

    private void helper(int[] nums, int pivot, List<Integer> path){
        //base
        result.add(new ArrayList<>(path));

        for(int i = pivot; i < nums.length; i++){
            //action
            path.add(nums[i]);
            //recurse
            helper(nums, i+1, path);
            //backtrack
            path.remove(path.size() - 1);
        }

    }
}
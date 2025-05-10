class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        int i = 0;
        for (int num : nums) {
            if (map.containsKey(target - num)) {
                arr[0] = map.get(target - num);
                arr[1] = i;
                return arr;
            } else {
                map.put(num, i);
            }
            i++;
        }
        return arr; 
    }
}

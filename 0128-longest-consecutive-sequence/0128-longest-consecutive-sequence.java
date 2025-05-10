class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==0) return 0;
        for(int num: nums){
            set.add(num);
        }
        int count=0;
        for(int num: set){
            if(!set.contains(num-1)){
                int curNum= num;
                int curStreak=1;
                while(set.contains(curNum+1)){
                    curNum++;
                    curStreak++;
                }
                count=Math.max(count,curStreak);
            }
        }
        return count;
        
    }
}
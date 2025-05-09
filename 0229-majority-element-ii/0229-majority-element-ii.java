class Solution {
    public List<Integer> majorityElement(int[] nums) {

    int n=nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        List<Integer> maj= new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>n/3 && !maj.contains(nums[i])){
               maj.add(nums[i]);
               
            }
        }
        return maj;
       
    }
}
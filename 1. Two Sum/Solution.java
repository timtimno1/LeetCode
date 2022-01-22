class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> data=new HashMap(nums.length);
        int[] temp=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(data.containsKey(target-nums[i]))
            {
                temp[0]=data.get(target-nums[i]);
                temp[1]=i;
                return temp;
            }
            data.put(nums[i],i);
        }
        return temp;
    }
}
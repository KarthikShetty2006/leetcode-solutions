class Solution {
    public void sortColors(int[] nums) {
        int a=0,b=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                a++;
            else if(nums[i]==1)
                b++;
            }
        
        for(int k=0;k<a;k++)
            nums[j++]=0;

        for(int k=0;k<b;k++)
            nums[j++]=1;

        for(int k=0;k<nums.length-a-b;k++)
            nums[j++]=2;
    }
}
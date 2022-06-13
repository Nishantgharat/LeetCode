class Solution {
    public int pivotIndex(int[] nums) {
        int totsum=0;
        int ret=-1;
        for(int i:nums){
            totsum=totsum+i;
        }
        int leftsum=0;
        int rightsum=totsum-nums[0];
        for (int i=0; i<nums.length;i++){
            rightsum=totsum-leftsum-nums[i];
            System.out.println("left:"+leftsum);
            System.out.println("right:"+rightsum);
            if (leftsum==rightsum){
                
                System.out.print("left:"+leftsum);
                System.out.print("right:"+rightsum);
                System.out.print("i"+i);
                ret= i;
                break;
            }
            else{
                leftsum=leftsum+nums[i];
                // rightsum=totsum-leftsum-nums[i+1];
            }   
        }
        return ret;
        
        
    }
}

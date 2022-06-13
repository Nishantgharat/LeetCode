class Solution {
    public int dominantIndex(int[] nums) {
        
        int a[] = nums.clone();
        
        Arrays.sort(a);
        int n=-1;
        if(nums.length==1 && nums[0]>=1){
            n=0;
            return n;
            
        }
        int max=a[a.length-1];
        
         System.out.println("a=="+max);
        
        if (a[nums.length-2]*2<=a[nums.length-1]){
            for(int i =0; i<nums.length;i++){
                if(nums[i]==max){
                    n=i;
                }
            }
            
            
        }
        return n;
    }
}

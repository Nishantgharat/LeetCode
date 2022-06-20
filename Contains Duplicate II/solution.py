class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        d={}
        for i,num in enumerate(nums):
            if (num in d and i-d[num]<=k):
                return "true"
            d[num]=i
      
        
        

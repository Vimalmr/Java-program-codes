class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        ll = []
        n = len(nums)
        j=0
        i=0
        while(j < n):
            l = []
            for i in range(0, n):
                if(nums[i]!=-1 and nums[i] not in l):
                    l.append(nums[i])
                    nums[i]=-1
                    j+=1
            ll.append(l)
        return ll
        

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}  # Step 1: Initialize the hash table
        for i, x in enumerate(nums):  # Step 2: Enumerate through nums
            y = target - x  # Step 3: Calculate complement y
            if y in m:  # Step 4: Check if y is present in the hash table
                return [m[y], i]  # Return the indices of the two elements adding up to target
            m[x] = i 
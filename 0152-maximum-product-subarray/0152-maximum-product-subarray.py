class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return 0

        # Initialize variables
        maxProd = nums[0]
        minProd = nums[0]
        result = nums[0]

        for i in range(1, len(nums)):
            # If the current number is negative, swap maxProd and minProd
            if nums[i] < 0:
                maxProd, minProd = minProd, maxProd

            # Update maxProd and minProd
            maxProd = max(nums[i], maxProd * nums[i])
            minProd = min(nums[i], minProd * nums[i])

            # Update the result with the maximum product so far
            result = max(result, maxProd)

        return result

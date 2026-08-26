class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # set(nums) removes duplicate elements
        return len(set(nums)) != len(nums)

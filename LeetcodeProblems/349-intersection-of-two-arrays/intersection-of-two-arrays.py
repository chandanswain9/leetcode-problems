class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        return list(set(nums1) & set(nums2))
        # set1 = set(nums1)
        # result = set()
        # for num in nums2:
        #     if num in set1:
        #         result.add(num)
        # return list(result)
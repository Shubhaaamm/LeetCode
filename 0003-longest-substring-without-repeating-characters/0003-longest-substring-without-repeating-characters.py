class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        unique_chars=set()
        left_pointer=0
        max_length=0
        for right_pointer, char in enumerate(s):
            while char in unique_chars:
                unique_chars.remove(s[left_pointer])
                left_pointer+=1
            unique_chars.add(char)

            max_length=max(max_length, right_pointer-left_pointer+1)
        
        return max_length
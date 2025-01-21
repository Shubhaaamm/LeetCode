class Solution(object):
    def myAtoi(self, s):
        """
        :type s: str
        :rtype: int
        """
    # Define the bounds for a 32-bit signed integer
        INT_MAX = 2**31 - 1  # 2147483647
        INT_MIN = -2**31     # -2147483648

        # Step 1: Trim leading whitespaces
        s = s.lstrip()
        if not s:
            return 0

        # Step 2: Handle optional '+' or '-' sign
        sign = 1
        index = 0
        if s[0] == '-':
            sign = -1
            index += 1
        elif s[0] == '+':
            index += 1

        # Step 3: Convert the valid digits to an integer
        result = 0
        while index < len(s) and s[index].isdigit():
            digit = int(s[index])
            # Step 4: Check for overflow and clamp
            if result > (INT_MAX - digit) // 10:
                return INT_MAX if sign == 1 else INT_MIN
            result = result * 10 + digit
            index += 1

        # Step 5: Apply the sign and return
        return sign * result

        
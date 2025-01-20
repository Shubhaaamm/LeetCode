class Solution {
    public int reverse(int x) {
    boolean isNegative = x < 0;
    x = Math.abs(x);

    // Convert to string and reverse
    String reversedString = new StringBuilder(String.valueOf(x)).reverse().toString();

    try {
        // Convert reversed string back to integer
        int reversed = Integer.parseInt(reversedString);
        return isNegative ? -reversed : reversed;
    } catch (NumberFormatException e) {
        // Return 0 if there's an overflow
        return 0;   
        
    }
    }
}

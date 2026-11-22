class Solution {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / digitLength;
        String num = String.valueOf(start);
        int index = (int) ((n - 1) % digitLength);
        return num.charAt(index) - '0';
    }
}
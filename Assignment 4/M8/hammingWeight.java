//Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight)

class hammingWeight {
    public int Solution(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;  
        }
        return count;
    }
}
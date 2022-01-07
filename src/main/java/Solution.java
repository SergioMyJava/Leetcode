package poweroftwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0 || n%2 != 0 && n != 1){
            return false;
        }
        if(n == 1){
            return true;
        }
        return isPowerOfTwo(n/2);
    }
}

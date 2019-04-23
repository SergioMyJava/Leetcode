package palindromenumber;

class Solution {
    public boolean isPalindrome(int x) {
        try {
            String number = String.valueOf(x);
            char[] a = number.toCharArray();
            if (a[0] == '-') {
                return false;
            } else {
                return new StringBuffer(number).reverse().toString().equals(number);
            }
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        return false;
    }
}

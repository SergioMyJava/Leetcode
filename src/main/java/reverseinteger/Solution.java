package reverseinteger;

class Solution {
    public int reverse(int x) {
        try {
            String number = String.valueOf(x);
            char[] a = number.toCharArray();
            if (a[0] == '-') {
                char[] reversNumber = new char[a.length];
                reversNumber[0] = a[0];
                for (int i = 1; i < a.length; i++) {
                    reversNumber[i] = a[a.length - i];
                }
                return Integer.parseInt(String.valueOf(reversNumber));
            } else {
                char[] reversNumber = new char[a.length];
                for (int i = 0; i < a.length; i++) {
                    reversNumber[i] = a[(a.length - 1) - i];
                }
                return Integer.parseInt(String.valueOf(reversNumber));
            }

        }
        catch(NumberFormatException e){
            System.out.println(e);
        }

        return 0;
    }
}

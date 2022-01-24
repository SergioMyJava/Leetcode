package longestcommonprefix;



public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (res == "") {
                return res;
            }
            res = findCommonPrefix(res, strs[i]);
        }
        return res;
    }

    public static String findCommonPrefix(String a, String b) {
        String pref = a.length() < b.length() ? a : b;
        for (int i = 0; i < pref.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                pref = pref.substring(0, i);
                break;
            }
        }
        return pref;
    }

    public static void main(String[] args){
        Solution test = new Solution();
        String[] words = {"малако","мама","патрик"};
        System.out.println(test.longestCommonPrefix(new String[]{"",""}));

    }
}

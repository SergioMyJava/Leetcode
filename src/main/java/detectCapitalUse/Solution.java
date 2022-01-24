package detectCapitalUse;

import java.sql.SQLOutput;

public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word == word.toUpperCase()) {
            return true;
        }
        if (word == word.toLowerCase()) {
            return true;
        }
        if (word.equals(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.detectCapitalUse("Leetcode"));
    }
}

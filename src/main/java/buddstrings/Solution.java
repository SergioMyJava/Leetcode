package buddstrings;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public static boolean buddyStrings(String A, String B) {
        if (A.length() <= 20000 && B.length() <= 20000) {
            for (int j = 0; j < A.length(); j++) {
                for (int i = 0; i < A.length(); i++) {
                    if (i != j) {
                        char[] str = A.toCharArray();
                        char current = str[i];
                        str[i] = str[j];
                        str[j] = current;
                        String newA = new String(str);
                        if (newA.equals(B)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean buddyStringsT(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            Set<Character> k = new HashSet<Character>();
            for (char a : A.toCharArray()) {
                k.add(a);
                return k.size() < A.length();
            }
        }
        List<Integer> notEqual = new ArrayList<Integer>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                notEqual.add(i);
            }
        }
        return notEqual.size() == 2 && A.charAt(notEqual.get(0)) == B.charAt(notEqual.get(1)) && A.charAt(notEqual.get(1)) == B.charAt(notEqual.get(0));
    }

    public static boolean buddyStringsK(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            Set<Character> s = new HashSet<Character>();
            for (char c : A.toCharArray()) s.add(c);
            return s.size() < A.length();
        }
        List<Integer> dif = new ArrayList<Integer>();
        for (int i = 0; i < A.length(); ++i) if (A.charAt(i) != B.charAt(i)) dif.add(i);
        return dif.size() == 2 && A.charAt(dif.get(0)) == B.charAt(dif.get(1)) && A.charAt(dif.get(1)) == B.charAt(dif.get(0));
    }

    public boolean buddyStringsE(String A, String B) {

        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < A.length(); j++) {
                if (i == j) continue;                       //зачем вот это ?

                char[] copy = A.toCharArray();
                char current = copy[j];
                copy[j] = A.charAt(i);
                copy[i] = current;

                if (B.equals(new String(copy))) return true;
            }
        }

        return false;
    }
}
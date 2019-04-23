package romantointeger;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        if (s != null) {
            int lastNumber = 0;
            int number = 0;
            HashMap<String, Integer> keyRoman = new HashMap();
            keyRoman.put("I", 1);
            keyRoman.put("V", 5);
            keyRoman.put("X", 10);
            keyRoman.put("L", 50);
            keyRoman.put("C", 100);
            keyRoman.put("D", 500);
            keyRoman.put("M", 1000);
            String roman = s.toUpperCase();
            for (int i = roman.length() - 1; i >= 0; i--) {
                number = handler(keyRoman.get(String.valueOf(roman.charAt(i))), lastNumber, number);
                lastNumber = keyRoman.get(String.valueOf(roman.charAt(i)));
            }
            return number;
        } else {
            return 1;
        }
    }

    private int handler(int fromMap, int lastNumber, int number) {
        if (fromMap < lastNumber) {
            return number - fromMap;
        } else {
            return number + fromMap;
        }

    }
}

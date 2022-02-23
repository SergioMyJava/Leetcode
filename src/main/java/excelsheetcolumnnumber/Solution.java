package excelsheetcolumnnumber;

public class Solution {
//    String[] alf = new String[2];

    public int titleToNumber(String columnTitle) {
        int number = 0;
        for (char ch : columnTitle.toCharArray()) {
            number = number * 26 + (ch - 'A') + 1;
        }
        return number;
        }


    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.titleToNumber("ZY"));
    }
}

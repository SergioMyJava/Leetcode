package zigzagconversion;

class Solution {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String answer = "";
        for (int row = 0; row < numRows; row++) {
            int increments = 2 * (numRows - 1);
            for (int y = row; y < s.length(); y++) {
                if ((y - row) % increments == 0) {
                    answer += s.charAt(y);

                    if (row > 0 && row < numRows - 1 && y + increments - 2 * row < s.length()) {
                        answer += s.charAt(y + increments - 2 * row);
                    }
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.convert("PAYPALISHIRING", 3));
    }
}

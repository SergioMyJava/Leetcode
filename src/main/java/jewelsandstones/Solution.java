package jewelsandstones;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        int b = 0;
        for(int i = 0;i<J.length();i++){
            char a = J.charAt(i);
            for(int j = 0;j<S.length();j++){
                if(a == S.charAt(j)){
                    b++;
                }
            }
        }
        return b;
    }
}

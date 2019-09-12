package defangingAnIPAddress;


public class Solution {
    public String defangIPaddr(String address) {
        String forReturn = "";
        int m = 0;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                forReturn = forReturn + address.substring(m, i);
                m = i+1;
                forReturn = forReturn + "[.]";
            }
        }
        forReturn = forReturn + address.substring(m,address.length());
        return forReturn;
    }
}

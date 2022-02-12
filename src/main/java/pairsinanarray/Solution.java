package pairsinanarray;

import java.util.Arrays;

public class Solution {

    public int findPairs(int[] nums, int k) {
        int unswer = 0;
        if (k == 0) {
            return repeedNum(nums);
        }
        int[] chek = del(nums);
        for (int y = 0; y < chek.length; y++) {
            for (int i = 0; i < chek.length; i++) {
                if (chek[y] + k == chek[i]) {
                    unswer++;
                }
            }
        }
        return unswer;
    }

    public int[] del(int[] a) {
        int[] ret = new int[a.length];
        Arrays.sort(a);
        int len = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                ret[len] = a[i];
                ret[len + 1] = a[i + 1];
                len++;
            }
        }
        //System.out.println("длинна нового масива" + len);
        return Arrays.copyOfRange(ret, 0, len + 1);
    }

    public int repeedNum(int[] a) {
        int count = 0;
        int index = 0;
        int ebaniyNol = 0;
        int coincid;
        int[] repeed = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            coincid = 0;
            count = 0;
            for (int y = 0; y < a.length; y++) {
                if (i != y) {
                    if(a[i] == 0 && ebaniyNol == 0){
                        index++;
                        ebaniyNol++;
                        break;
                    }
                    if (a[i] == a[y]) {
                        count++;
                    }
                }
            }
            if (count != 0) {
                for (int f = 0; f < a.length; f++) {
                    if (a[i] == repeed[f]) {
                        coincid++;
                    }
                }
                if (coincid == 0) {
                    repeed[index] = a[i];
                    index++;
                }

            }

        }
        return index;
    }
}

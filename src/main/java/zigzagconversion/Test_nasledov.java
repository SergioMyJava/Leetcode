package zigzagconversion;

import java.sql.SQLOutput;

public class Test_nasledov {

    public void chipok(){
        System.out.println("bez parametrov");
    }

    protected void chipok(int e){
        System.out.println("s paarametrom e = " + e);
    }

    public int chipok(int r, int t){
        System.out.println("s dwuma param, ih summ = ");
        return r+t;
    }
}

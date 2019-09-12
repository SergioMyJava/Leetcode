package defangingAnIPAddress;

public class App {

    public static void main(String[] args){
        Solution t = new Solution();
        String ip = "255.100.50.0";
        String m = t.defangIPaddr(ip);
        System.out.println(m);
    }
}

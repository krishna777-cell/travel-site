import java.util.*;
//krishna is makis to sese n git

public class Keypad {

    public static String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static void sakhi(String d, int idx, String a,List<String> res){
        if(idx==d.length()){
            res.add(a);
            return;
        }
        String currStr=keypad[d.charAt(idx)-'0'];
        for(int i=0; i<currStr.length(); i++){
            sakhi(d, idx+1, a+currStr.charAt(i),res);
        }
        
    }
    static void kk(String d){
        List<String> res = new ArrayList<>();

        sakhi(d,0,"",res);
        System.out.println(res);
    }
    public static void main(String[] args) {
        String d="23";
        kk(d);
    }
}

import java.util.*;


public class Lambda7 {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        map.put("A", "B");
        map.put("C", "D");
        map.put("E", "F");
        for (HashMap.Entry<String,String> l:map.entrySet()){
            String s1 = l.getKey();
            String s2 = l.getValue();
            str.append(s1).append(s2);
        }
        System.out.println(str);
    }
}
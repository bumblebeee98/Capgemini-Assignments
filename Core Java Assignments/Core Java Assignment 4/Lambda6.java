import java.util.*;
import java.util.function.UnaryOperator;

public class Lambda6 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Kunal");
        list.add("Aman");
        list.add("Raunak");
        UnaryOperator<String> uo = l -> l.toUpperCase();
        list.replaceAll(uo);
        System.out.println(list);
    }
}

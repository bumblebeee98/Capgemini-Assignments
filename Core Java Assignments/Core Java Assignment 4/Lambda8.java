import java.util.ArrayList;
import java.util.function.Consumer;
public class Lambda8 extends Thread{

    public void run(int l){
        Consumer<Integer> mylambda = i -> System.out.println(i);
        mylambda.accept(l);
    }
    public static void main(String[] args) {
        Lambda8 thread=new Lambda8();  
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(Integer l:list){
            thread.run(l);
        }     
    }
    
}
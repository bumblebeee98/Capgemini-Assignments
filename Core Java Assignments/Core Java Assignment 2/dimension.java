class Line extends shape {
    void draw(){
        System.out.println("Line");
    }
}
class Rectangle extends shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Cube extends shape{
    void draw(){
        System.out.println("Cube");
    }
}
 abstract class shape{
    abstract void draw();
}
public class dimension {
    public static void main(String[] args) {
            Line l1=new Line();
            l1.draw();
            Rectangle r1=new Rectangle();
            r1.draw();
            Cube c1=new Cube();
            c1.draw();
    }
}
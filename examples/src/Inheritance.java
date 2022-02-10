import java.util.*;
class Calculator2{
    public void addition(int x ,int y){
        System.out.println(x+y);
    }
}
class Scientifical extends Calculator2{
    public void area(int side){
        System.out.println(side*side);
    }

}
public class Inheritance {
    public static void main(String[] args) {
        try {
            Scientifical obj = (Scientifical) new Calculator2();
            obj.area(7);
           // Calculator2 obj1 = new Scientifical();
          //  obj1.addition(2, 3);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

import java.util.*;
class Question implements Comparable<Question>{
    private int id;
    private String name;
    public Question(){}

    public Question(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Question(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public  String toString(){
        return "id: "+ this.id + "name: " + this.name;

    }
    public  int compareTo(Question o){
        if(this.id!=o.getId()){
            return this.id- o.getId();
        }
        return this.name.compareTo(o.getName());


    }

}
public class Records {

    public static void main(String[] args){
        //Scanner sc= new Scanner(System.in);
        //int n = sc.nextInt();
        Question [] ques = {new Question(111,"Rajesh      "),new Question(102,"Raj"),new Question(116,"Tom"),new Question(101,"Sooraj")};
        Arrays.sort(ques);
        System.out.println(Arrays.toString(ques));

        }

    }


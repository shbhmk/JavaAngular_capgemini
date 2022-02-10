import java.util.*;
class Calculation{
    private int first_number;
    private int second_number;
    public Calculation(){};

    public Calculation(int first_number, int second_number) {
        this.first_number = first_number;
        this.second_number = second_number;
    }

    public int getFirst_number() {
        return first_number;
    }

    public int setFirst_number(int first_number) {
        this.first_number = first_number;
        return first_number;
    }

    public int getSecond_number() {
        return second_number;
    }

    public int setSecond_number(int second_number) {
        this.second_number = second_number;
        return second_number;
    }
    public void calculations(int first_number,int second_number,String op){
        switch (op){
            case "+":
                System.out.println(first_number+second_number);
                break;
            case"-":
                System.out.println(first_number-second_number);
                break;
            case"*":
                System.out.println(first_number*second_number);
                break;
            case"/":
                System.out.println(first_number/second_number);
                break;
            default:
                System.out.println("Enter the valid operator");


        }

    }
}
public class Calculator {
    public static void main(String[]  args ){
        Calculation cal=new Calculation();

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the operation you want to perform ");
        String operation = sc.nextLine();

        System.out.println("enter the First number ");
        int first_number= sc.nextInt();

        System.out.println("enter the Second number ");
        int second_number=sc.nextInt();

        cal.calculations(cal.setFirst_number(first_number),cal.setSecond_number(second_number),operation);


    }

}

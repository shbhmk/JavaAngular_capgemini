import java.util.*;
class Calculation {
    private int first_number;
    private int second_number;
    private String operation;

    public Calculation() {
    }

    public Calculation(int first_number, int second_number, String operation) {
        this.first_number = first_number;
        this.second_number = second_number;
        this.operation = operation;
    }

    public int getFirst_number() {
        return first_number;
    }

    public void setFirst_number(int first_number) {
        this.first_number = first_number;


    }

    public int getSecond_number() {
        return second_number;
    }

    public void setSecond_number(int second_number) {
        this.second_number = second_number;

    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }


    public void calculation1(Calculation cal) {
        switch (cal.getOperation()) {
            case "+":
                System.out.println(this.first_number + this.second_number);
                break;
            case "-":
                System.out.println(this.first_number - this.second_number);
                break;
            case "*":
                System.out.println(this.first_number * this.second_number);
                break;
            case "/":
                System.out.println(this.first_number / this.second_number);
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
        cal.setOperation(operation);

        System.out.println("enter the First number ");
        int first_number= sc.nextInt();
        cal.setFirst_number(first_number);

        System.out.println("enter the Second number ");
        int second_number=sc.nextInt();
        cal.setSecond_number(second_number);

        cal.calculation1(cal);


    }

}


class Score{
    private int marks;
    public Score() {};
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }



    public Score(int marks){
        this.marks=marks;
    }
    public void calc(){
        if (marks > 90 ){
            System.out.println("A");

        }
        else if( marks >80 && marks<90){
            System.out.println("B");

        }
        else if(marks > 70 && marks<80){
            System.out.println("C");
        }
        else{
            System.out.println("Average");
        }


    }

}

public class hello {
    public static void main(String[] args ){
        Score s=new Score();
        s.setMarks(72);
        s.calc();

    }
}

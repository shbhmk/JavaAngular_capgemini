import java.util.Scanner;
class studentDetails{
    int id;
    String name;
    int cmarks;
    int pmarks;
    int mmarks;
    public studentDetails(){}
    public studentDetails(int id, String name, int cmarks, int pmarks, int mmarks) {
        this.id=id;
        this.name=name;
        this.cmarks=cmarks;
        this.pmarks=pmarks;
        this.mmarks=mmarks;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getCmarks() {return cmarks;}
    public void setCmarks(int cmarks) {this.cmarks = cmarks;}
    public int getPmarks() {return pmarks;}
    public void setPmarks(int pmarks) {this.pmarks = pmarks;}
    public int getMmarks() {return mmarks;}
    public void setMmarks(int mmarks) {this.mmarks = mmarks;}

    public double avgMarks() {
        double marks = (this.cmarks + this.pmarks + this.mmarks) / 3;
        return marks;
    }
    public void checkGrade()
    {
        double marks=this.avgMarks();
        if(marks>=91&&marks<=100)
            System.out.println("A");
        else if(marks>=80&&marks<=90)
            System.out.println("B");
        else if(marks>=70&&marks<=80)
            System.out.println("C");
        else
            System.out.println("Average");
    }
    @Override
    public String toString() {
        return "studentDetails{" + "id=" + id + ", name='" + name + '\'' + ", cmarks=" + cmarks + ", pmarks=" + pmarks + ", mmarks=" + mmarks + '}';
    }
}

public class CalcMax{
    public static studentDetails StudentwithMaxPerc(studentDetails[] studet)
    {
        int len=studet.length;
        int index=0;
        double max = studet[index].avgMarks();
        for (int i = 0; i < len; i++) {
            if (max < studet[i].avgMarks())
            {
                index = i;
                max = studet[i].avgMarks();
            }
        }
        return studet[index];
    }
    public static void main(String[] args)
    {
        studentDetails studet1=new studentDetails(101, "Raj",95,85,97);
        studentDetails studet2=new studentDetails(102, "Rajesh",68,85,77);
        studentDetails studet3=new studentDetails(103, "Tom",70,55,87);
        studentDetails studet4=new studentDetails(104, "Suraj",85,85,67);
        studentDetails[] studArray=new studentDetails[4];
        studArray[0]=studet1;
        studArray[1]=studet2;
        studArray[2]=studet3;
        studArray[3]=studet4;
        studentDetails std=StudentwithMaxPerc(studArray);
        System.out.println(std.toString());
        System.out.println("Maximum %age is: "+std.avgMarks());
        std.checkGrade();
    }
}
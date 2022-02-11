import java.util.ArrayList;

interface Hiring{
    DetailsStudent[] hiringConditions(DetailsStudent [] sd);
}
class DetailsStudent{
    private int mMarks;
    private int cMarks;
    private int pMarks;
    private String name;
    public DetailsStudent(){}

    public DetailsStudent(int mMarks, int cMarks, int pMarks, String name) {
        this.mMarks = mMarks;
        this.cMarks = cMarks;
        this.pMarks = pMarks;
        this.name = name;
    }

    public int getmMarks() {
        return mMarks;
    }

    public void setmMarks(int mMarks) {
        this.mMarks = mMarks;
    }

    public int getcMarks() {
        return cMarks;
    }

    public void setcMarks(int cMarks) {
        this.cMarks = cMarks;
    }

    public int getpMarks() {
        return pMarks;
    }

    public void setpMarks(int pMarks) {
        this.pMarks = pMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return this.getName();
    }
    public double averageMarks(){
        double marks=(this.mMarks+this.pMarks+this.cMarks)/3;
        return marks;
    }
    public void display(DetailsStudent[] sd){
        for(int i=0;i<sd.length;i++){
            if(sd[i] == null){
                return;
            }
            System.out.println(sd[i].getName());
        }
    }
  /*  public String GradeCalculator(){
        double storeMarks = this.averageMarks();
        if(storeMarks>=91&&storeMarks<=100) {
            return "A";
        }
        else if(storeMarks>=80&storeMarks<=90){
            return "B";
        }
        else if(storeMarks>=70&&storeMarks<=80){
            return "C";
        }
        else{
            return "D";
        }
    }*/

}
class HP implements Hiring {


    @Override
    public DetailsStudent[] hiringConditions(DetailsStudent[] sd) {
        DetailsStudent[] arr= new DetailsStudent[sd.length];
        int k=0;
        ArrayList<String>hpCandidates=new ArrayList<>();
        for (int i = 0; i < sd.length; i++) {
            if (sd[i].averageMarks() >=55 && sd[i].getmMarks() > 60) {
                hpCandidates.add(sd[i].getName());
                arr[k++] = sd[i];
            }
            }
        System.out.println("Candidates Selected for HP are"+hpCandidates);
        return arr;
        }
    }

class Tcs implements Hiring {
    @Override
    public DetailsStudent[] hiringConditions(DetailsStudent[] sd) {
        DetailsStudent[] arr= new DetailsStudent[sd.length];
        int k=0;
        ArrayList<String>TcsCandidates=new ArrayList<>();
        for (int i = 0; i < sd.length; i++) {
            if (sd[i].averageMarks() > 45 && sd[i].getmMarks() > 55) {
                TcsCandidates.add(sd[i].getName());
                arr[k++]=sd[i];
            }
        }
        System.out.println("Candidates Selected for TCS are"+TcsCandidates);
        return arr;
        }
    }

class Capgemini implements Hiring {
    @Override
    public DetailsStudent[] hiringConditions(DetailsStudent[] sd) {
        DetailsStudent[] arr= new DetailsStudent[sd.length];
        int k=0;
        ArrayList<String>CapgeminiCandidates=new ArrayList<>();
        for (int i = 0; i < sd.length; i++) {
            if (sd[i].averageMarks() > 40 && sd[i].getmMarks() > 50) {
                CapgeminiCandidates.add(sd[i].getName());
                arr[k++] = sd[i];
            }
        }
        System.out.println("Candidates Selected for Capgemini are"+CapgeminiCandidates);
        return arr;
        }
    }

class Infosys implements  Hiring {
    @Override
    public DetailsStudent[] hiringConditions(DetailsStudent[] sd) {
        DetailsStudent[] arr= new DetailsStudent[sd.length];
        int k=0;
        ArrayList<String>InfosysCandidates=new ArrayList<>();
        for (int i = 0; i < sd.length; i++) {
            if (sd[i].averageMarks() > 60 && sd[i].getmMarks() > 70) {
                InfosysCandidates.add(sd[i].getName());
                arr[k++] = sd[i];
            }
        }
        System.out.println("Candidates Selected for Infosys are"+InfosysCandidates);
        return arr;

        }

    }

public class PlacementCriteria {
public static void main(String[] args){
    DetailsStudent[] stud = new DetailsStudent[4];
    DetailsStudent stu = new DetailsStudent();
    stud[0] = new DetailsStudent( 67, 55, 45, "Raj");
    stud[1] = new DetailsStudent( 77, 65, 85, "Rajesh");
    stud[2] = new DetailsStudent( 60, 43, 55, "Suraj");
    stud[3] = new DetailsStudent( 70, 71, 65, "Tom");
    HP hp= new HP();
    DetailsStudent[] eligible = new DetailsStudent[stud.length];
     eligible = hp.hiringConditions(stud);
     
    // stu.display(eligible);

    Capgemini cap = new Capgemini() ;
    cap.hiringConditions(stud);

    Tcs tcs =new Tcs();
    tcs.hiringConditions(stud);

    Infosys inf = new Infosys();
    inf.hiringConditions(stud);

}
}

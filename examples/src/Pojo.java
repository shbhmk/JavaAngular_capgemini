class Student {
    private int id, mMarks, cMarks, pMarks;
    private String name;

    public Student() {
    }

    public Student(int id, int mMarks, int cMarks, int pMarks, String name) {
        this.id = id;
        this.mMarks = mMarks;
        this.cMarks = cMarks;
        this.pMarks = pMarks;
        this.name = name;
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
    /*@Override
    public String toString(){
        return "StudentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cmarks=" + cMarks +
                ", pmarks=" + pMarks +
                ", mmarks=" + mMarks +
                '}';
    }*/

 public Student StudentGradeCalculator(Student [] student) {
        int arr[]=new int[4];
        float temp;

        for(int i =0;i<4;i++){
            arr[i]=(student[i].getpMarks()+student[i].getmMarks()+student[i].getcMarks())/3;

        }
        int max= arr[0];
        int pos =0;
        for(int i=0;i<4;i++) {
            if (arr[i] > max) {
                max = arr[i];
                pos++;

            }
        }
            return student[pos];



     //return null;
 }
}
public class Pojo {
    public static void main(String[] args) {
        Student s= new Student();
        Student[] stu = new Student[4];
        stu[0] = new Student(101, 67, 55, 45, "raj");
        stu[1] = new Student(102, 77, 65, 85, "Rajesh");
        stu[2] = new Student(103, 60, 43, 55, "suraj");
        stu[3] = new Student(104, 70, 71, 65, "tom");
        Student stude=s.StudentGradeCalculator(stu);
        System.out.println(stude.getName());





    }
}



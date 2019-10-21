package PracticeDemo;



public class Main1 {
    public static void main(String[] args) {
        Student s1=new Student(11,"divyanshu");
        System.out.println(s1);


    }
}
class Student {
    int rollno;
    String sname;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                '}';
    }

    public Student(int rollno, String sname) {
        this.rollno=rollno;
        this.sname=sname;




    }
}

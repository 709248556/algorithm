package transfer;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("学生",10);
        Student student1 = new Student("学生1",101);
        System.out.println("student.getName():"+student.getName()+",student.getStudentNum():"+student.getStudentNum());
        System.out.println("student1.getName():"+student1.getName()+",student1.getStudentNum():"+student1.getStudentNum());
        swapName(student,student1);
        swapNum(student,student1);
        System.out.println("student.getName():"+student.getName()+",student.getStudentNum():"+student.getStudentNum());
        System.out.println("student1.getName():"+student1.getName()+",student1.getStudentNum():"+student1.getStudentNum());

    }

    public static void swap(Student student,Student student1){
        Student temp = new Student();
        temp = student;
        student = student1;
        student1 = temp;
    }
    public static void swapName(Student student,Student student1){
        String temp = null;
        temp = student.getName();
        student.setName(student1.getName());
        student1.setName(temp);
    }
    public static void swapNum(Student student,Student student1){
        int temp = 0;
        temp = student.getStudentNum();
        student.setStudentNum(student1.getStudentNum());
        student1.setStudentNum(temp);
    }
}

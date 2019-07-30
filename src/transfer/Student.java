package transfer;

/**
 * @author yanlianglong
 * @Title: student.java
 * @Package PACKAGE_NAME
 * @Description:
 * @date 2019/6/4 11:17
 */
public class Student {
    private String name;
    private int studentNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
    public Student(String name,int studentNum){
        this.name = name;
        this.studentNum = studentNum;
    }
    public Student(){
    }
}

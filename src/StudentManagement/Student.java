package StudentManagement;

public class Student {
    //  setter and Getter method encapsulation
    //create parameter constructor
    private int sId;
    private String  sname;
    private int age;
//Default Constructor
    public Student(){
        super();

    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    //print the object details
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}

package StudentManagement;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentUtility {
    public static  Scanner sc =new Scanner(System.in);

    // Method
    // 1.Add Student

    // 2. Update Student

    //3. display Student

    //4. Delete Method

    public static Student addStudent(){
        Student s=new Student();
        System.out.print("Plese Enter Student id :");
        s.setsId(sc.nextInt());

        System.out.print("Plese Enter Student name :");
        s.setSname(sc.next());

        System.out.print("Plese Enter Student Age :");
        s.setAge(sc.nextInt());

        return  s;


    }
    public static void updateStudent(List<Student> students){
        System.out.println("Plese Enter the Update Details");
        System.out.println("Enter sId:");
        int id=sc.nextInt();
        System.out.println("Enter sName:");
        String name=sc.next();
        System.out.println("Enter sAge:");
        int age=sc.nextInt();

        //Done Change in Actual List
        int count=0;
        for(Student s:students){
            if(id==s.getsId()){
                break;

            }
            count++;
        }
        students.get(count).setSname(name);
        students.get(count).setAge(age);
    }


    //ArrayList
    public static void dispalyStudent(List<Student> students){
        //use Iterrator
       Iterator<Student> studnetIterator= students.iterator();
       while (studnetIterator.hasNext()){
           System.out.println(studnetIterator.next().toString());

       }


    }
    public static void deleteStudnet(List<Student> students,int sId){
       Iterator<Student> studentIterator= students.iterator();
       while (studentIterator.hasNext()){
           Student s=studentIterator.next();
           if(s.getsId()==sId){
               studentIterator.remove();
           }


       }
        System.out.println();
    }

}

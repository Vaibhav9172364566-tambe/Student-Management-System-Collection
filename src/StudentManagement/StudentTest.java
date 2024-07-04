package StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
     static  Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int count=0;

        List<Student> studentList=new ArrayList<Student>();
        while (true){
            if(count!=0){
                System.out.println("\n\n\n Do want continune press any key 'yes'");
                 String continues=sc.next();
                 if(continues.equalsIgnoreCase("yes")){

                 }
                 else {
                     System.exit(0);
                 }

            }
            count++;

            System.out.println("Studnet Project Management");
            System.out.println("==============================");
            System.out.println("1.Add Studnet ");
            System.out.println("2. Update Studnet");
            System.out.println("3.Display Student");
            System.out.println("4.Delete Studnet");
            System.out.println("5.Exit/Stop");
            System.out.println("Please Select operation :");
            int option=sc.nextInt();
            //Switch Case for paricular operation
            switch (option){
                case 1:
                    //Add Studnet
                    Student student=StudentUtility.addStudent();
                    studentList.add(student);
                    System.out.println("Studnet Added Succefully");
                    break;


                case 2:
                    //Update Studnet
                    StudentUtility.updateStudent(studentList);
                    System.out.println("Studnet Data Succefully Update");

                    break;

                case 3:
                    //Display Studnet
                    StudentUtility.dispalyStudent(studentList);
                    break;

                case 4:
                    //Delete Student
                    System.out.println("Delete Student option ");
                    System.out.println("Enter Studnet d");
                    int sid=sc.nextInt();
                    StudentUtility.deleteStudnet(studentList,sid);
                    System.out.println("Studnet Data Succefully Delete");
                    break;



                case 5:
                    //Stop the program Execution
                    System.exit(0);break;
                default:
                    //Plese Enter Correct Option
                    System.err.println("plese correct option");

            }

        }
    }
}

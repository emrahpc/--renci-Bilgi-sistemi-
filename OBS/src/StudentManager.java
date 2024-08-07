import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students;
    private int currentId;

    public StudentManager(){

        students=new ArrayList<>() ;
        this.currentId=1;
    }
    public void studentAdd(String name,String number){

        Student newstudent=new Student(currentId,name,number);
         students.add(newstudent);
        System.out.println("yeni biri eklendi" +newstudent.toString());
         currentId++;

    }
    public void studentlist(){

        if(students.isEmpty()) {

            System.out.println("listeniz boş");
        }

        for(Student student:students) {
            System.out.println(student);
        }
    }
    public void studentDelete(int id){
      for(Student student:students){
          if(student.getId()==id){
              students.remove(student);
              System.out.println("öğrenci silindi " +student);
              return;
          }
      }
        System.out.println("öğrenci bulunamadı");
    }
     public void studentUpdate(int id,String name,String number){
        for (Student student:students)
        {
            if(student.getId()==id) {
                student.setName(name);
                student.setNumber(number);
                System.out.println("öğrenci güncellendi"+student);
                return;
            }

        }
         System.out.println("öğrenci bulunmadı");
     }








}

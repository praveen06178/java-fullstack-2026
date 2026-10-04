import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final   List<Student> students=new ArrayList<>();
    private int nextId=1;

    public void addStudent(String name,String email,String phone,String course){
        Student s=new Student(nextId++,name,email,phone,course);
        students.add(s);
        System.out.println("Student added successfully.");

    }

    public void listStudents(){
        if(students.isEmpty()){
            System.out.println("No students founded");
            return;
        }
        for(Student s:students){
            System.out.println(s);
        }


    }
    public Student findStudentById(int id){
        for(Student s:students){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }

    public boolean updateStudent(int id,String name,String email,String phone,String course){
        Student s=findStudentById(id);
        if(s!=null){
            s.setName(name);
            s.setEmail(email);
            s.setPhone(phone);
            s.setCourse(course);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean deleteStudent(int id){
        Student s=findStudentById(id);
        if(s!=null){
            students.remove(s);
            return true;
        }
        else{
            return false;
        }
}
}

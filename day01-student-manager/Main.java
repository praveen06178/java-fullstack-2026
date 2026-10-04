import java.util.*;
class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        StudentManager manager=new StudentManager();
        while(true){
            System.out.println("\n====== Student Manager ======");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Name: ");
                    String name=sc.next();
                    System.out.println("Email: ");
                    String email=sc.nextLine();
                    System.out.println("Phone: ");
                    String phone=sc.nextLine();
                    System.out.println("Course: ");
                    String course=sc.nextLine();
                    manager.addStudent(name,email,phone,course);
                    break;
                case 2:
                    manager.listStudents();
                    break;
                case 3:
                    System.out.println("ID to update: ");
                    int update=sc.nextInt();
                    sc.nextLine();
                    System.out.println("New Name: ");
                    String newName=sc.nextLine();
                    System.out.println("New Email: ");
                    String newEmail=sc.nextLine();
                    System.out.println("New Phone: ");
                    String newPhone=sc.nextLine();
                    System.out.println("New Course: ");
                    String newCourse=sc.nextLine();
                    if(manager.updateStudent(update,newName,newEmail,newPhone,newCourse)){
                        System.out.println("Student updated successfully.");
                    }else{
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("ID to delete: ");
                    int deleteID=sc.nextInt();
                    if(manager.deleteStudent(deleteID)){
                        System.out.println("Student deleted successfully.");
                    }else{
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String course;
    public Student(int id,String name,String email,String phone,String course){
        this.id=id;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.course=course;
    }
    public int getId(){ return id;}
    public String getName(){ return name;}
    public String getEmail(){ return email;}
    public String getPhone(){ return phone;}
    public String getCourse(){ return course;}

    public void setName(String name){ this.name=name;}
    public void setEmail(String email){ this.email=email;}
    public void setPhone(String phone){ this.phone=phone;}
    public void setCourse(String course){ this.course=course;}

    @Override 
    public String toString(){
        return "ID: "+id+", Name: "+name+", Email: "+email+", Phone: "+phone+", Course: "+course;
    }
}   
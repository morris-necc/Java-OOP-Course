package myPackage;
public class Teacher extends Person {
    private int numCourses=0;
    private String[] courses = new String[3];

    public Teacher() {
    }

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + super.getName() + ", address=" + super.getAddress() + '}';
    }

    public boolean addCourse(String course){
        // empty
    }

    public boolean removeCourse(String course){
        //empty
    }
    
}

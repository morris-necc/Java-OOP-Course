package myPackage;
public class Driver {
    public static void main(String[] args){
        Student s1 = new Student();
        
        s1.setName("Rezza");
        s1.setAddress("Binus");
        
        System.out.println(s1.getName() + " " + s1.getAddress());
        
        s1.addCourseGrade("OOP", 90);
        s1.addCourseGrade("Math", 50);
        s1.addCourseGrade("DS", 50);
        
        s1.printGrades();
        
        System.out.println(s1.getAverageGrade());
        
        
    }
}

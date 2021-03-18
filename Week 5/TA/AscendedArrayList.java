import java.util.*;

public class AscendedArrayList {
    public static void main(String args[]){
        ArrayList<StudentData> students = new ArrayList<StudentData>();
        students.add(new StudentData("Raffles Teh Weihan", "Green", 2440102493L));
        students.add(new StudentData("Hassan Mohamed Hasan", "Red", 2440105785L));
        students.add(new StudentData("Monique Senjaya", "Blue", 2440061285L));
        students.add(new StudentData("Ariel Putra", "Yellow", 2440100273L));
        students.add(new StudentData("Ardelia Shaula Araminta", "Black", 2440065163L));

        StudentData key;
        int j;
        // insertion sort info according to their name
        for(int i = 1; i < students.size(); i++){
            key = students.get(i);
            j = i - 1;
            while(j >= 0 && students.get(i - 1).name.compareTo(key.name) > 0){
                students.set(j+1, students.get(j)); // this part is wrong
                j--;
            }
            students.set(j+1, key);
        }
        //print
        System.out.println("Sorted by name");
        System.out.println();
        for(StudentData student: students){
            student.printString();
        }
        System.out.println("=============================================");
        System.out.println();

        // insertion sort info according to their colour
        for(int i = 1; i < students.size(); i++){
            key = students.get(i);
            j = i - 1;
            while(j >= 0 && students.get(i - 1).color.compareTo(key.color) > 0){
                students.set(j+1, students.get(j)); // this part is wrong
                j--;
            }
            students.set(j+1, key);
        }
        //print
        System.out.println("Sorted by color");
        System.out.println();
        for(StudentData student: students){
            student.printString();
        }
    }
}

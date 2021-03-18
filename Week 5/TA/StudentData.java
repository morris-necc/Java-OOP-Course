public class StudentData {
    String name;
    String color;
    long id;

    public StudentData(String n, String c, long i){
        name = n;
        color = c;
        id = i;
    }

    public void printString(){
        String printString = id + " | " + name + " | " + color;
        System.out.println(printString);
    }
}

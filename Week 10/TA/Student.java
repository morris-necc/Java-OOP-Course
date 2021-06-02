public class Student extends Human implements StudentBehavior{
    public int gpa;

    public Student(int a, String n, int g){
        super(a, n);
        this.gpa = g;
    }

    @Override
    public void talk(){
        System.out.println(String.format("Hello, I am %s and I am %d years old", name, age));
    }

    @Override
    public void study(){
        System.out.println("ughhh i hate studying");
    }

    @Override
    public void procrastinate(){
        System.out.println("haha cat video funny");
    }

    @Override
    public void cry(){
        System.out.println("waaaaaaaaa");
    }

    @Override
    public void praiseTheElderGods(){
        System.out.println("L' mgepog'drn r'luhhor Y' goka thee fm'latghnanah gn'th'bthnkor gn'th'bthnk hup lw'nafhnah n'ghauh'ee ot ymg' mghrii ");
    }
}

public abstract class Human {
    public int age;
    public String name;

    public Human(){
        this.age = 0;
        this.name = "";
    }

    public Human(int a, String n){
        this.age = a;
        this.name = n;
    }

    public abstract void talk();
}

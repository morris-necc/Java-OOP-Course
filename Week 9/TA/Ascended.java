// what can you change to make it work? (slide 8)
// get rid of the static keyword

public class Mammal{
    private int legs;
    private int eyes;
    private String color;
    
    public Mammal(){
        this.legs = 0;
        this.eyes = 2;
        this.color = "green";
    }

    public Mammal(int l){
        this.legs = l;
        this.eyes = 2;
        this.color = "green";
    }

    public Mammal(int l, int e){
        this.legs = l;
        this.eyes = e;
        this.color="green";
    }

    public Mammal(int l, int e, String c){
        this.legs = l;
        this.eyes = e;
        this.color = c;
    }

    public String walk(){
        return "the mammal walks";
    }
}

public class Human extends Mammal{
    public Human(String c){
        super(2, 2, c);
    }

    public String walk(){
        return "the human walks";
    }
}
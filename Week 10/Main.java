import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        PoliceCar policeCar = new PoliceCar();
        PoliceCar[] myList = {policeCar};
        myList[0].chase();
    }
}

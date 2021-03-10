import java.util.Scanner;

public class Exercise {
    public static void main (String args[]){
        //1
        float arr[] = {65, 3.4f, 4.3f};


        //2
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[5];

        for (int i = 0; i<5; i++){
            System.out.println("Enter number: ");
            inputs[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 4; i >= 0; i--){
            System.out.println(inputs[i]);
        }

        sc.close();

        //3

        int[] newArray = {10, 55, 12, 3, 44, -3};
        int itemToCheck = 12;

        for (int i = 0; i < newArray.length; i++){
            if (itemToCheck == newArray[i]){
                System.out.println("Item found at index "+ i);
                break;
            }
        }

        //4
    }
}

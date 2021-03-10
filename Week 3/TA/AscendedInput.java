import java.util.Scanner;

public class AscendedInput {
    public static void main(String[] args){
        //variables to keep track
        int pos = 0;
        int neg = 0;
        int even = 0;

        for(int i = 0; i < 20; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number:");
            int num = sc.nextInt();
            sc.nextLine();
            //checks for even
            if(num % 2 == 0){
                even++;
            }
            //checks for positive/negative
            if(num > 0){
                pos++;
            } else if (num < 0){
                neg++;
            }
        }
        
        //print results
        System.out.println("There are " + pos + " positive numbers");
        System.out.println("There are " + neg + " negative numbers");
        System.out.println("There are " + even + " even numbers");
        System.out.println("There are " + (20-even) + " odd numbers");
        System.out.println("There are " + (20-pos-neg) + " 0s");
    }
}

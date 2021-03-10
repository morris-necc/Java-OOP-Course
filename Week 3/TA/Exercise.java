import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        //Exercise
        //input a number and check if the number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int num = sc.nextInt();
        sc.nextLine(); //sometimes necessary if you want to avoid error
        if (num%2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        //Print your name 5 times using a while loop
        int count = 0;
        while(count < 5){
            System.out.println("Morris");
            count++;
        }

        //print 7 to 12 using do while loop
        count = 7;
        do {
            System.out.println(count);
            count++;
        } while (count < 13);

        //print 5 4 3 2 1 using for loop
        for(int x = 5; x >= 1; x--){
            System.out.println(x);
        }

    }
}

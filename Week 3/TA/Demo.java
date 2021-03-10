import java.util.Scanner;  // Import the Scanner class

public class Demo {
    public static void main(String[] args) {
        //if statement
        int n = 20;
        if(n == 20){
            System.out.println("Hello I am 20");
        } else if (n == 30) {
            System.out.println("Hello I am 30");
        } else {
            System.out.println("Hello I am something else");
        }

        //switch case statements
        int n2 = 20;
        switch(n2) {
            case 20:
                System.out.println("Hello I am 20");
                break;
            case 30:
                System.out.println("Hello I am 30");
                break;
            default:
                System.out.println("Hello I am someting else");
                break;
        }

        //for loop
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //while loop
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }

        //do while loop
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a == 0); // Code will run once

    }
}
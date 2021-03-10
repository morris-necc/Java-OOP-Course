package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exercise {
    public static void main(String[] args) {

        // 2 differences between string and char
        // string has more than 1 character
        // string non-primitive

        // can you cast an integer into a char
        // yes, through

        //casting double into a string and vice versa
        double d = 15.7;
        String doubleString = Double.tostring(d);
        double d2 = Double.parsedouble(doubleString);
        System.out.println(d2);


        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(system.in));
        System.out.printLn("Please enter your name");
        String name = reader.readline();

        System.out.printLn("Please enter your age");
        int age = (int)reader.readline();
        age += 10;

        System.out.printLn("Your name is "+name+" and in 10 years you will be "+(String)age+"years old!");
    }
}

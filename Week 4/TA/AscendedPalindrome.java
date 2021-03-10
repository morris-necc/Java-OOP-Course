import java.util.Scanner;

public class AscendedPalindrome {
    public static void main(String args[]){
        // variable declaration
        boolean flag = false;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the word: ");
        String input[] = sc.next().split("");
        sc.nextLine();
        int max = input.length - 1;
        int sideLength = input.length/2;
        
        while(!flag && i <= sideLength){
            //System.out.println(input[i] + " and " + input[max - i]);
            if(input[i].equals(input[max-i])){ //don't use == when checking string
                i++;
            } else {
                flag = true;
            }
        }

        if(!flag){
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
    }
}

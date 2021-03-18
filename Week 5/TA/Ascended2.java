import java.util.Scanner;

public class Ascended2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word/sentence:");
        String input = sc.nextLine();
        sc.nextLine();

        // i don't want to think about it anymore
        input = input.replaceAll("a", "a\"a");
        input = input.replaceAll("A", "A\"A");
        input = input.replaceAll("i", "i\"i");
        input = input.replaceAll("I", "I\"I");
        input = input.replaceAll("u", "u\"u");
        input = input.replaceAll("U", "U\"U");
        input = input.replaceAll("e", "e\"e");
        input = input.replaceAll("E", "E\"E");
        input = input.replaceAll("o", "o\"o");
        input = input.replaceAll("O", "O\"O");

        System.out.println(input);
    }
}

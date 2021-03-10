import java.util.Scanner;

public class AscendedDiagonals {
    public static void main(String[] args){

        //probably very inefficient but hey as long as it works

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int length = sc.nextInt();
        sc.nextLine();
        //first line
        for(int i = 1; i <= length; i++){
            System.out.print("*");
        }
        System.out.println();

        //top-middle lines
        for(int lines = 1; lines <= (length-2)/2; lines++){
            //left stars
            for(int stars = 1; stars <= lines; stars++){
                System.out.print("*");
            }
            System.out.print(" ");
            //middle stars
            for(int stars = 1; stars <= length - lines*2 - 2; stars++){
                System.out.print("*");
            }
            System.out.print(" ");
            //right stars
            for(int stars = 1; stars <= lines; stars++){
                System.out.print("*");
            }
            System.out.println();
        }

        //middle line if odd
        if (length%2 == 1){
            for(int middle = 1; middle <= (length - 1)/2; middle++){
                System.out.print("*");
            }
            System.out.print(" ");
            for(int middle = 1; middle <= (length - 1)/2; middle++){
                System.out.print("*");
            }
        }

        // bottom-middle lines
        for(int lines = (length-2)/2; lines >= 1; lines--){
            //left stars
            for(int stars = lines; stars >= 1; stars--){
                System.out.print("*");
            }
            System.out.print(" ");
            //middle stars
            for(int stars = length - lines*2 - 2; stars >= 1; stars--){
                System.out.print("*");
            }
            System.out.print(" ");
            //right stars
            for(int stars = lines; stars >= 1; stars--){
                System.out.print("*");
            }
            System.out.println();
        }

        //last line
        for(int i = 1; i <= length; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}

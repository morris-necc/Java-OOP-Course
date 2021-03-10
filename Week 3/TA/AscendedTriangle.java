import java.util.Scanner;

public class AscendedTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int height = sc.nextInt();
        sc.nextLine();
        // left-leaning right-angled triangle
        for(int line = 1; line <= height; line++){
            for(int stars = 1; stars <= line; stars++){
                System.out.print("*");
            }
            System.out.println();//next line
        }

        //right leaning right-angled triangle
        for(int line = 1; line <= height; line++){
            for(int spaces=height-line; spaces>0; spaces--){
                System.out.print(" ");
            }
            for(int stars = 1; stars <= line; stars++){
                System.out.print("*");
            }
            System.out.println();//next line
        }
        
        //isoceles
        for(int line = 1; line <= height; line++){
            for(int spaces=height-line; spaces>0; spaces--){
                System.out.print(" ");
            }
            for(int stars = 1; stars <= (line-1)*2 + 1; stars++){
                System.out.print("*");
            }
            System.out.println();//next line
        }
    }
}

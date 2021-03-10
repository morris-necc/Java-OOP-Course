import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class SimpleExercise {
    public static void main(String[] args){
        // robot named robby
        // can move based on given direction (N,E,W,S) and distance (n>0)
        boolean quit = false;
        int choice = 0;
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);

        while(choice != 4){
            System.out.println("=====================================")
            System.out.println("Pick what you want to do with Robby");
            System.out.println("1. Check position");
            System.out.println("2. Move");
            System.out.println("3. Reset position");
            System.out.println("4. Quit");
            System.out.print("Enter your choice here: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    if (x == 0 && y == 0){
                        System.out.printLn("Robby is at origin (0,0)")
                    } else {
                        System.out.println("Robby is at ("+x+","+y+")");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("In which direction do you want him to move (n/e/s/w)");
                    System.out.print("Enter your choice here: ");
                    char direction = sc.next().charAt(0);
                    System.out.print("Enter distance: ");
                    int dist = sc.nextInt();
                    sc.nextLine();
                    // used monique's because this is way shorter
                    switch(direction){
                        case 'n' -> y += dist;
                        case 's' -> y -= dist;
                        case 'e' -> x += dist;
                        case 'w' -> x -= dist;
                    }
                    System.out.println();
                    break;
                case 3:
                    x = 0;
                    y = 0;
                    System.out.println();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
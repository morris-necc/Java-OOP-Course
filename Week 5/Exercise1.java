public class Exercise1 {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        double average;

        for(int n:a){
            sum+=n;
        }
        average = sum/a.length;
        System.out.println("The average is " + average);

    }
}
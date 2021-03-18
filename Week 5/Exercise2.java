public class Exercise2 {
   public static void main(String[] args){
    int[] a = {15, 2, 7, 9, 22, 34, 1, 54, 26};
    String[] b = {"test", "hello", "a", "sjanjn"};

    for (int i = 0; i < a.length - 1; i++){
        for (int j = 0; j < a.length - i - 1; j++){
            if (a[j] > a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }

    for (int i = 0; i < b.length - 1; i++){
        for (int j = 0; j < b.length - i - 1; j++){
            if (b[j].compareTo(b[j+1]) > 0){
                String temp = b[j];
                b[j] = b[j+1];
                b[j+1] = temp;
            }
        }
    }

    for (int x: a){
        System.out.print(x+" ");
    }
    System.out.println();
    for (String y: b){
        System.out.print(y+" ");
    }
   } 
}

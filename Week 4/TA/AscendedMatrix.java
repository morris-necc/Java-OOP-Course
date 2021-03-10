public class AscendedMatrix {
    public static void main (String args[]){
        //matrix declarations
        int firstMatrix[][] = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        int secondMatrix[][] = {{9, 8, 7}, {6, 5, 4},{3, 2, 1}};
        int resultingMatrix[][] = new int[3][3];

        //matrix multiplication
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                for(int i = 0; i < 3; i++){
                    resultingMatrix[y][x] += firstMatrix[y][i] * secondMatrix[i][x];
                }
            }
        }

        //print
        for(int[] array : resultingMatrix){
            for (int item : array){
                System.out.print(item+", ");
            }
            System.out.println();
        }

        //dot product
        int a[] = {3, 5, 8};
        int b[] = {2, 7, 1};
        int product = 0;

        for(int c = 0; c < a.length; c++){
            product += a[c] * b[c];
        }
        System.out.println("The dot product is "+product);
    }
}

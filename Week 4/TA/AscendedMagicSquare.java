public class AscendedMagicSquare {
    public static void main (String args[]){
        //my monkey brain can't think ahead
        //hence the code only works for the first square
        //this is because the code is based on the assumption that the magic square will always have an empty spot where the answer is obvious
        //but oh well this is an optional assignment anyways
        //why is this so much harder than the next one

        //======IMPORTANT======
        //if you want to see how it works with the other squares, scroll to the bottom and un-comment the code that breaks the loop
        //else you'll get an infinite loop

        int[][] square1 = {{0, 0, 4},
                        {0, 0, 3},
                        {6, 0, 8}};
        int[][] square2 = {{0, 8, 0, 0},
                        {11, 0, 6, 0},
                        {0, 12, 15, 5},
                        {0, 13, 0, 0}};
        int[][] square3 = {{24, 5, 0, 8, 0},
                        {0, 7, 0, 25, 0},
                        {0, 0, 3, 17, 0},
                        {0, 19, 10, 0, 23},
                        {6, 0, 0, 0, 20}};
        int[][] square4;
        square4 = fillSquare(square1);
        for(int row = 0; row<square4.length; row++){
            for(int item: square4[row]){
                System.out.print(item + ", ");
            }
            System.out.println();
        }

        

    }

    public static int[][] fillSquare(int[][] square){
        int count = 0;
        int sum = 0;
        int location = 0;
        int filledCount = 0;
        int n = square.length;
        int magicConstant = (n%2==0)?(n*(n*n+1))/2:n*((n*n+1)/2);

        while(filledCount < n*2 + 2){
            filledCount = 0;
            //check for almost filled rows
            for(int i = 0; i<n ; i++){
                count = 0;
                sum = 0;
                location = 0;

                for(int j = 0; j<n; j++){
                    if(square[i][j] != 0){
                        count++;
                        sum += square[i][j];
                    }else{
                        location = j;
                    }
                }
                if(count == n-1){ //if row almost filled
                    square[i][location] = magicConstant - sum;
                    filledCount++;
                } else if (count == n) {
                    filledCount++;
                }
            }

            //check for almost filled columns
            for(int i = 0; i<n ; i++){
                count = 0;
                sum = 0;
                location = 0;

                for(int j = 0; j<n; j++){
                    if(square[j][i] != 0){
                        count++;
                        sum += square[j][i];
                    }else{
                        location = j;
                    }
                }
                if(count == n-1){ //if row almost filled
                    square[location][i] = magicConstant - sum;
                    filledCount++;
                } else if (count == n) {
                    filledCount++;
                }
            }

            //check for top left -> bottom right diagonal
            count = 0;
            sum = 0;
            for(int i = 0; i < n; i++){
                if(square[i][i] != 0){
                    count++;
                    sum += square[i][i];
                } else {
                    location = i;
                }
            }
            if(count == n-1){ //if row almost filled
                square[location][location] = magicConstant - sum;
                filledCount++;
            } else if (count == n) {
                filledCount++;
            }

            //check for top right -> bottom left diagonal
            count = 0;
            sum = 0;
            for(int i = n - 1; i >= 0; i--){
                if(square[i][n-1-i] != 0){
                    count++;
                    sum += square[i][n-1-i];
                } else {
                    location = i;
                }
            }
            if(count == n-1){ //if row almost filled
                square[location][n-1-location] = magicConstant - sum;
                filledCount++;
            } else if (count == n) {
                filledCount++;
            }
            // use the code below if you want to test for square 2 and 3
            // if(filledCount >= 4){
            //     break;
            // }
        }
        return square;
    }
}

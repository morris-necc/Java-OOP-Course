public class Ascended {
    public static void main(String[] args){
        for(int j = 1; j<= 500; j++){
            if(checkPrime(j)){
                System.out.println(j);
            }
        }

    }

    public static boolean checkPrime(int num){
        boolean prime = true;
        for (int i = 2; i<=num/2; i++){
            if (num % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}

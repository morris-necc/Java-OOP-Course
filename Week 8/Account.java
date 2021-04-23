public class Account {
    // Attributes
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amt){
        if(amt >= 0){
            this.balance += amt;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amt){
        if(amt >= 0){
            if(amt < this.balance){
                this.balance -= amt;
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }

}
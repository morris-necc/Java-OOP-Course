import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bName){
        this.bankName = bName;
    }

    public void addCustomer(String f, String l){
        this.numberOfCustomers++;
        customers.add(new Customer(f, l));
    }

    public int getNumOfCustomers(){
        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customers.get(index);
    }
}

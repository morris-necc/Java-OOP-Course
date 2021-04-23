import java.util.Scanner;

public class DriverClass {
    static int choice;
    static int state = 1;
    static Customer editCustomer;
    public static boolean flag = true;
    public static Bank bank = new Bank("Ginkou Bank");
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        while(flag){
            switch(state){
                case 1:
                    mainMenu();
                    break;
                case 2:
                    editCustomer();
                    break;
            }
        }
    }

    public static void mainMenu(){
        System.out.println("============= Bank Admin Menu =============");
        System.out.println("1. Add Customer");
        System.out.println("2. Edit Customer");
        System.out.println("3. View Customer List");
        System.out.println("4. Exit");
        System.out.print("Enter your choice here: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                System.out.print("\nEnter the customer's first name: ");
                String f = sc.nextLine();
                sc.nextLine();
                System.out.print("\nEnter the customer's last name: ");
                String l = sc.nextLine();
                sc.nextLine();
                System.out.print("\nEnter the customer's balance amount: ");
                double b = sc.nextDouble();
                sc.nextLine();
                System.out.println();
                bank.addCustomer(f, l);
                bank.getCustomer(bank.getNumOfCustomers() - 1).setAccount(new Account(b));
                break;
            case 2:
                System.out.print("\nEnter customer index: ");
                int customerIndex = sc.nextInt();
                sc.nextLine();
                if(customerIndex < 0 || customerIndex >bank.getNumOfCustomers()){
                    System.out.println("Error: Invalid Index");
                } else {
                    editCustomer = bank.getCustomer(customerIndex);
                    state = 2;
                }
                break;
            case 3:
                System.out.println("============= Customer List =============");
                System.out.println("Index  |  First Name  |  Last Name  |  Balance");
                for(int i = 0; i <= bank.getNumOfCustomers() - 1; i++){
                    Customer tempCustomer = bank.getCustomer(i);
                    Account tempAccount = tempCustomer.getAccount();
                    System.out.print(i+" | "+tempCustomer.getFirstName()+" | "+tempCustomer.getLastName()+" | "+tempAccount.getBalance()+"\n");
                }
                break;
            case 4:
                flag = false;
                break;
            default:
                System.out.println("That is not a valid choice");
        }
    }

    public static void editCustomer(){
        double amount;
        boolean success;
        System.out.println("============= Bank Admin Menu =============");
        System.out.println("Currently editing: "+editCustomer.getFirstName()+" "+editCustomer.getLastName());
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice here: ");
        choice = sc.nextInt();
        sc.nextLine();

        switch(choice){
            case 1:
                System.out.print("\nEnter the amount: ");
                amount = sc.nextDouble();
                sc.nextLine();
                success = editCustomer.getAccount().deposit(amount);
                if(success){
                    System.out.println("\nDeposited "+amount+" succesfully!");
                } else {
                    System.out.println("\nUnable to deposit "+amount+"!");
                }
                break;
            case 2:
            System.out.print("\nEnter the amount: ");
                amount = sc.nextDouble();
                sc.nextLine();
                success = editCustomer.getAccount().withdraw(amount);
                if(success){
                    System.out.println("\nWithdrew "+amount+" succesfully!");
                } else {
                    System.out.println("\nUnable to withdraw "+amount+"!");
                }
                break;
            case 3:
                System.out.println(editCustomer.getFirstName()+" "+editCustomer.getLastName()+" has "+editCustomer.getAccount().getBalance()+" deposited");
                break;
            case 4:
                state = 1;
                break;
            default:
                System.out.println("That is not a valid choice");
        }
    }
}

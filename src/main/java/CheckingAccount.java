public class CheckingAccount {
    public String name;
    public double balance;

    public void withdraw(double a) {
        if (balance < 1) {
            System.out.println("Warning!!!");
        } else {
            System.out.println(a - balance);
        }
    }
}


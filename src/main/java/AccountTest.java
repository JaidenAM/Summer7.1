public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount cA = new CheckingAccount();
        cA.balance = 25.0;
        cA.name = "Jah";
        cA.withdraw(30);
    }
}

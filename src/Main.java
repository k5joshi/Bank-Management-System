import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Bank Sbi = new Bank();

        BankAccount firstAccount = new BankAccount(982372902173032l, "kartik", 4000);
        Sbi.addAccount(firstAccount);
        System.out.println(Sbi.showAllAccounts());


    }
}
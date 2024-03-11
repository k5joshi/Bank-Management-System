import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class Bank {

    private List<BankAccount> bankaccounts;

    public Bank (){
        bankaccounts = new ArrayList<>();

    }

    public void addAccount(BankAccount account){
        bankaccounts.add(account);
    }
    public void removeAccount(long accountNumber){
        // we need to use a iterator to modify a arraylist
        Iterator <BankAccount> iterator = bankaccounts.iterator();
        while(iterator.hasNext()){
        BankAccount a = iterator.next();
            if(a.getAcc_number() == (accountNumber)){
                iterator.remove();
                break;
            }
        }
    }


    public BankAccount searchAccount(long accountNumber){
        for(BankAccount a : bankaccounts){
            if(a.getAcc_number() == (accountNumber)){
                return a;
            }
        }
        return null;
    }


    public List<BankAccount> showAllAccounts(){
        return bankaccounts;
    }


    public void depositMoney(int cashToDeposit, long accountNumber){
        BankAccount account = searchAccount(accountNumber);
        double currBalance = account.getAcc_balance();
        currBalance = cashToDeposit+currBalance;
        account.setAcc_balance(currBalance);
    }


    public void withdrawMoney(int cashToWithdraw, long accountNumber){
        BankAccount account = searchAccount(accountNumber);
        double currBalance = account.getAcc_balance();
        if(currBalance > 1000){
            currBalance = currBalance - cashToWithdraw;
            account.setAcc_balance(currBalance);
        }else{
            System.out.println("INSUFFICIENT BALANCE \n unable to process");
        }
    }


    public void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------- Welcome to the Bank ---------------");
        System.out.println("======= Choose an option ======= ");
        System.out.println("\t 1. Create an account");
        System.out.println("\t 2. Delete an account");
        System.out.println("\t 2. Search your account");
        System.out.println("\t 3. Exit");

        int in = sc.nextInt();
        sc.nextLine();       
        
    }
}



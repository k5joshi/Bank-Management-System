public class BankAccount {
    private long acc_number;
    private String acc_holdername;
    private double acc_balance;


    public BankAccount(long accountNumber, String accountHolderName, double accountBalance){
        this.acc_number = accountNumber;
        this.acc_holdername= accountHolderName ;
        this.acc_balance = accountBalance;
    }

    public long getAcc_number(){
        return acc_number;
    }
    public String getAcc_holdername(){
        return acc_holdername;
    }
    public double getAcc_balance(){
        return acc_balance;
    }

    public void setAcc_number(long accountNumber){
        this.acc_number = accountNumber;
    }
    public void setAcc_holdername(String accountHolderName){
        this.acc_holdername = accountHolderName;
    }
    public void setAcc_balance(double accountBalance){
        this.acc_balance = accountBalance;
    }

    @Override
    public String toString(){
        return ":-----: :-----: :-----: Account details :-----: :-----: :-----:\n"+
                "Account Number: " + acc_number + "\n"+
                "Account Holder Name: "+ acc_holdername + "\n" +
                "Account Balance: "+acc_balance +"\n\n"+
                ":-----: :-----: :-----: DETAILS FETCHED SUCCESSFULLY :-----: :-----: :-----:";
    }
}

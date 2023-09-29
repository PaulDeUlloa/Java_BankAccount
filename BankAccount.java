public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; 
    // ^ refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }



    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingBalance(){
        return this.savingsBalance;
    }
    public static getAccounts(){
        return this.accounts;
    }
    public static getTotalMoney(){
        return this.totalMoney;
    }



    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void deposit(double deposit){
        this.checkingBalance += deposit;
        totalMoney += deposit;
    }

    public void deposit(double deposit){
        this.savingBalance += deposit;
        totalMoney += deposit;
    }




    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double outgoingMoney){
        if(outgoingMoney <= this.savingsBalance){
            this.checkingBalance -= outgoingMoney;
            totalMoney -= outgoingMoney;
        };
    }
    public void withdraw(double outgoingMoney){
        if(outgoingMoney <= this.savingsBalance){
            this.savingsBalance -= outgoingMoney;
            totalMoney -= outgoingMoney;
        };
    }


    // getBalance
    // - display total balance for checking and savings of a particular bank account


}
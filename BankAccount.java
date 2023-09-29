public class BankAccount {
    //! MEMBER VARIABLES
    private double checkingBalance;
    private double savingBalance;
    private static int accounts = 0;
    private static double totalMoney = 0; 
    // ^ refers to the sum of all bank account checking and saving balances

    //! CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(){
        this.checkingBalance = 0;
        this.savingBalance = 0;
        accounts++;
    }



    //! GETTERS
    // for checking, saving, accounts, and totalMoney
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingBalance(){
        return this.savingBalance;
    }

    //*don't need this if it is static
    public static int getAccounts(){
        return accounts;
    }
    public static double getTotalMoney(){
        return totalMoney;
    }



    //! METHODS
    // deposit
    // - users should be able to deposit money into their checking or saving account
    public void depositChecking(double deposit){
        this.checkingBalance += deposit;
        totalMoney += deposit;
    }

    public void depositSaving(double deposit){
        this.savingBalance += deposit;
        totalMoney += deposit;
    }

    //! Withdraw 
    // - users should be able to withdraw money from their checking or saving account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawChecking(double withdraw){
        if(this.checkingBalance < withdraw){
            System.out.println("Insufficient funds");
        }else{
            this.checkingBalance -= withdraw;
            totalMoney -= withdraw;
        }
    }
    public void withdrawSaving(double withdraw){
        if(this.savingBalance < withdraw){
            System.out.println("Insufficient funds");
        }else{
            this.savingBalance -= withdraw;
            totalMoney -= withdraw;
        }
    }

    //! getBalance
    // - display total balance for checking and saving of a particular bank account
    public double getBalance(){
        return checkingBalance + savingBalance;
    }

}
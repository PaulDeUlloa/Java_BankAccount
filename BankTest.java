public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts

        System.out.println("Total Accounts: " + BankAccount.getAccounts());
        //* ^gives us current count before going through the listed below accounts

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();



        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        account1.deposit(100);
        account2.deposit(300);
        account3.deposit(467); 
        System.out.println("account1 Money: " + account1.getCheckingBalance());
        System.out.println("account2 Money: " + account2.getCheckingBalance());
        

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney

        account1.withdraw(50);
        account2.withdraw(40);
        account3.withdraw(67); 

        System.out.println("account1 Money: " + account1.getCheckingBalance());
        System.out.println("account2 Money: " + account2.getCheckingBalance());







        // Static Test (print the number of bank accounts and the totalMoney)

        System.out.println("Total Accounts: " + BankAccount.getAccounts());
        System.out.println("Total Money: " + BankAccount.getTotalMoney());
    }
}
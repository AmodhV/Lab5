//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
    private static int accounts = 0;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;

    }
    public static int getAccounts() {
        return accounts;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int set) {
      accountNumber = set;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalanace(double money) {
        accountBalance = money;
    }
    public double getInterestEarned() {
        return interestEarned;
    }
    public void setInterestEarned(double set) {
        interestEarned = set;
    }
    public void setOwnerName(String setName) {
        ownerName = setName;
    }
    public String getOwnerName() {
        return ownerName;
    }


}

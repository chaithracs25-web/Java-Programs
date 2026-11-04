package reports;

import transaction.Account;

public class Report
{
    public void generate(Account a)
    {
        System.out.println("\n--- Transaction Report ---");
        System.out.println("Account Number: " + a.getAccountNumber());
        System.out.println("Balance: " + a.getBalance());
    }
}
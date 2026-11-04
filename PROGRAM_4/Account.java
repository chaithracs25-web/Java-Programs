package transaction;

public class Account
{
    int accno;
    double balance;

    public Account(int a, double b)
    {
        accno = a;
        balance = b;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public int getAccountNumber()
    {
        return accno;
    }
}



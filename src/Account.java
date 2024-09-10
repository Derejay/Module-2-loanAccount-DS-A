public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double startingBalance){
        this.balance = startingBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if(amount > 0){
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Current Balance: $" +balance;
    }
}

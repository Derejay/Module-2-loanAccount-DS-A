public class cardDebit extends Account{
    public cardDebit(){
        super();
    }

    public cardDebit(double promo){
        setBalance(promo);
    }

    @Override
    public boolean deposit(double _amount){
        if(_amount <= 0){
            System.out.println("Error: Deposit must be above $0");
            return false;
        }
        setBalance(getBalance() + _amount);
        return true;
    }

    @Override
    public boolean withdraw(double _amount){
        if(_amount > getBalance()){
            System.out.println("Error: Insufficient Funds");
            return false;
        }
        if(_amount <= 0){
            System.out.println("Error: Amount must be above $0");
            return false;
        }
        double wBalance = getBalance() - _amount;
        setBalance(wBalance);
        return true;
    }

    @Override
    public String toString(){
        String debitInfo = "Current Balance: " + getBalance();
        return debitInfo;
    }
}

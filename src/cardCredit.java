public class cardCredit extends Account{
    public int creditLimit;

    public cardCredit(){
        super();
    }

    public cardCredit(int limit){
        this.creditLimit = limit;
    }

    @Override
    public boolean deposit(double _amount){
        if(_amount > creditLimit){
            System.out.println("This transaction breaches your credit limit.");
            return false;
        }

        double wBalance = getBalance() - _amount;
        setBalance(wBalance);
        return true;
    }

    @Override
    public boolean withdraw(double _amount){
        if(_amount <=0){
            System.out.println("Invalid: Amount must be greater than zero! ");
            return false;
        }
        setBalance(getBalance() + _amount);
        return true;
    }

    @Override
    public String toString(){
        String creditInfo = "Current Credit Limit: " + creditLimit + "\n" + "Current Credit Balance: " +getBalance();
        return creditInfo;
    }





}

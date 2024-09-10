public class loanAccount extends Account {

    private double principle;
    double totalPrinciple = 0.0;
    double paymentsInterest = 0.0;
    private double interest = 0.28;
    double loan = principle * interest;

    loanAccount(double principle) {
        this.principle = principle;
        this.loan = principle * interest;
    }

    @Override
    public boolean deposit(double _amount) {
        if (_amount <= 0) {
            return false;
        } else if (_amount > principle) {
            return false;
        } else {
            this.principle -= _amount;
            totalPrinciple += _amount;
            paymentsInterest += _amount * interest;
            loan = this.principle + (this.principle * interest);
            refreshLoanInterest();
            return true;
        }
    }

    private void refreshLoanInterest() {
        loan = this.principle * interest;
        paymentsInterest = totalPrinciple * interest;
    }

    public boolean getPayment() {
        System.out.println("Payment Accepted: $" + totalPrinciple);
        System.out.println("Payment Accepted: $" + paymentsInterest);
        System.out.println("Total Remaining Principle: $" + (principle - totalPrinciple));
        return true;
    }

    @Override
    public boolean withdraw(double _amount){
        return false;
        }

        @Override
    public String toString(){
        String reportPrinciple = "Total remaining Principle: $" + principle;
        return reportPrinciple;
        }
    }

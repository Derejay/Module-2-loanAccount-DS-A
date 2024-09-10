public class Main {
    public static void main(String[] args) {

        loanAccount loan = new loanAccount(500);
        System.out.println(loan);

        loan.deposit(250);
        System.out.println(loan);

        loan.getPayment();

        cardCredit credit1 = new cardCredit(1000);
        credit1.deposit(500);
        System.out.println(credit1);

        credit1.withdraw(200);
        System.out.println(credit1);

        cardDebit debit1 = new cardDebit(1000);
        debit1.withdraw(200);
        System.out.println(debit1);

    }
}
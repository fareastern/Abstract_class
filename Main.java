public class Main {
    static SimpleAccount debit = new SimpleAccount();
    static CreditAccount credit = new CreditAccount(-100_000);

    public static void main(String[] args) {
        showAccount();
        debit.add(500_000);
        credit.add(300_000);
        showAccount();

        debit.pay(700_000);
        credit.pay(500_000);
        showAccount();

        debit.pay(330_000);
        credit.pay(55_000);
        showAccount();

        debit.pay(2_000_000);
        debit.transfer(credit, 30_000);
        showAccount();
    }

    static void showAccount() {
        System.out.println("На счету дебита: " + debit.getBalance());
        System.out.println("На счету кредита: " + credit.getBalance());
        System.out.println();
    }
}
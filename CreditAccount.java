class CreditAccount extends Account {
    private final long creditLimit;

    public CreditAccount(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <= 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= creditLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
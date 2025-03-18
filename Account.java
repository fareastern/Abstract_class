public abstract class Account {
    protected long balance;

    public long getBalance() {
        return balance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public void transfer(Account account, long amount) {
        if (this.pay(amount)) {
            if (account.add(amount)) {
            } else {
                this.add(amount);
            }
        }
    }
}
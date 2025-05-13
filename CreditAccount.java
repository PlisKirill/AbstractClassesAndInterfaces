public class CreditAccount extends Account{

    private long amount = 0;
    private long limit = 0;

    public CreditAccount(long limit) {
        this.limit -= limit;
    }

    @Override
    public boolean add(long amount) {
        if ((this.amount + amount) > 0) {
            return false;
        } else {
            this.amount += amount;
            return true;
        }
    }

    @Override
    public boolean pay(long amount) {
        if ((this.amount - amount) < limit) {
            return false;
        } else {
            this.amount -= amount;
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (pay(amount) == true) {
            account.add(amount);
            return true;
        } else return false;
    }

    @Override
    public long getBalance() {
        return amount;
    }
}

public class SimpleAccount extends Account{

    private long amount = 0;

    @Override
    public boolean add(long amount) {
      this.amount += amount;
      return true;
    }

    @Override
    public boolean pay(long amount) {
        if ((this.amount - amount) < 0) {
            return false;
        } else {
            this.amount -= amount;
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (pay(amount) == true) {
            if (account.add(amount) == true) {
                return true;
            } else {
                add(amount);
                return false;
            }
        } else return false;
    }

    @Override
    public long getBalance() {
        return amount;
    }

}

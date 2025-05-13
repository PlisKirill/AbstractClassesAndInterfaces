public class Main {

    public static void main(String[] args) {

        Account simpleAccount = new SimpleAccount();
        Account creditAccount = new CreditAccount(100000);

        simpleAccount.add(50000);
        simpleAccount.pay(10000);
        //long amountS = simpleAccount.getBalance();
        //System.out.println(amountS);

        creditAccount.pay(30000);
        //long amountC = creditAccount.getBalance();
        //System.out.println(amountC);

        simpleAccount.transfer(creditAccount, 50000);
        long amountS = simpleAccount.getBalance();
        long amountC = creditAccount.getBalance();
        System.out.println(amountC);
        System.out.println(amountS);

        SimpleLogger simpleLogger = new SimpleLogger();
        SmartLogger smartLogger = new SmartLogger();
        simpleLogger.log("I don't have error");
        smartLogger.log("I don't have error");
        smartLogger.log("Hello!");
    }
}

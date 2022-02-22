abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    int deposited = 100;

    public void getBalance() {
        System.out.println(deposited);
    }
}

class BankB extends Bank {
    int deposited = 150;

    public void getBalance() {
        System.out.println(deposited);
    }
}

class BankC extends Bank {
    int deposited = 200;

    public void getBalance() {
        System.out.println(deposited);
    }
}

public class AbstratClassBankDemonstrate {
    public static void main(String[] args) {
        BankA b1 = new BankA();
        b1.getBalance();
        BankB b2 = new BankB();
        b2.getBalance();
        BankC b3 = new BankC();
        b3.getBalance();
    }
}
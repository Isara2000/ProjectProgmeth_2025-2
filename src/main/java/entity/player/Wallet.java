package entity.player;

public class Wallet {
    private double balance;

    public Wallet(){
        setBalance(0);
    }

    public void add(double amount){
        this.setBalance(this.getBalance()+amount);
    }

    public boolean withdraw(double amount){
        if(amount<=this.getBalance()){
            setBalance(this.getBalance()-amount);
            return true;
        }else{
            return false;
        }
    }

    public void setBalance(double balance) {
        this.balance = Math.max(0,balance);
    }

    public double getBalance() {
        return balance;
    }
}

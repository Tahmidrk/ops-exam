class account extends Thread{
    private String name;
    private int balance;
    private String requestType;
    private int amount;

    account(String name,int balance){
        this.name=name;
        this.balance=balance;
    }
    public void setRequestType(String requestType,int amount){
        this.requestType=requestType;
        this.amount=amount;
    }
    public void getBalance(){
        System.out.println(name+" Balance:"+balance+" BDT");
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println(name+" Deposit:"+amount+" BDT. new balance:"+balance+"BDT");
    }

    public void withdraw(int amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println(name+" Withdraw:"+amount+" BDT. new balance:"+balance+"BDT");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void run(){
        switch (requestType){
            case "balance":
                getBalance();
                break;
                case "deposit":
                    deposit(amount);
                    break;
                    case "withdraw":
                        withdraw(amount);
                        break;
                        default:
                            System.out.println("Invalid Request");
        }
    }
}
public class thread{
    public static void main(String[] args) {
        account a=new account("a",1000);
        account b=new account("b",100);
        account c=new account("c",10000);

        a.setRequestType("balance",0);
        b.setRequestType("deposit",500);
        c.setRequestType("withdraw",500);
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        Thread t3=new Thread(c);
        t1.start();
        t2.start();
        t3.start();

    }

}
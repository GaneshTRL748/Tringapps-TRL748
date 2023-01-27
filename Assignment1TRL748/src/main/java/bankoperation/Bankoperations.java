package bankoperation;
import java.util.Scanner;
import java.util.logging.Logger;
public class Bankoperations{
    Scanner p=new Scanner(System.in);
    Logger l= Logger.getLogger("com.api.jar");
    String accname;
    private int pinno;
    long accno;
    double  balance;
    Bankoperations(String accname,long accno,double balance,int pino)
    {
        this.accname=accname;
        this.accno=accno;
        this.balance=balance;
        this.pinno=pino;
    }
    void deposit(double amount)
    {
        if(pinvalidation()){
              this.balance=balance+amount;
              l.info("Amount SuccessFully Credited");
        }
        else{
            l.info("Wrong Pin!!!!!!");
        }
    }
    void withdraw(double amount)
    {
        if(pinvalidation()){
        if(amount > this.balance)
        {
            l.log("Hi "+ this.accname +" Insufficient Balance!!!!");
        }
        else{
             this.balance=balance-amount;
             l.info("Amount SuccessFully Debited");
        }
        }
        else{
            l.info("Wrong Pin!!!");
        }
    }
    boolean pinvalidation()
    {
        l.info("Enter your PinNumber:");
        int pinv=p.nextInt();
        if(pinv==this.pinno)
        {
            return true;
        }
        else{
            return false;
        }
    }
    double balanceamount()
    {
        if(pinvalidation())
        {
          return this.balance;
        }
        else{
            l.info("Wrong Pin!!");
            return 0;
        }
    }
    public static void main(String[] args)
    {
    	 Logger l= Logger.getLogger("com.api.jar");
        Bankoperations a1=new Bankoperations("ganesh",1247170000153950L,200,1685);
        a1.deposit(500);
        a1.withdraw(500);
        l.log("Hi "+a1.accname+" Your Current balance:"+a1.balanceamount());
        bankoperation a2=new bankoperation("Ruby",124717000153951L,5000,1247);
        a2.deposit(2000);
        a2.withdraw(10000);
        l.log("Hi "+a2.accname+" Your Current balance:"+a2.balanceamount());
    }
}


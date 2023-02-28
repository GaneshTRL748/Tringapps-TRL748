package bankoperation;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Bankoperations{
    static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
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
               out.println("Amount SuccessFully Credited");
        }
        else{
            out.println("Wrong Pin!!!!!!");
        }
    }
    void withdraw(double amount)
    {
        if(pinvalidation()){
        if(amount > this.balance)
        {
            out.println(" Insufficient Balance!!!!");
        }
        else{
             this.balance=balance-amount;
             out.println("Amount SuccessFully Debited");
        }
        }
        else{
              out.println("Wrong Pin!!!");
        }
    }
    boolean pinvalidation()
    {	
    	Scanner p=new Scanner(System.in);
       out.println("Enter your PinNumber:");
        int pinv=p.nextInt();
        return (this.pinno==pinv);
    }
    String balanceamount()
    {
        if(pinvalidation())
        {
          return  Double.toString(this.balance);
        }
        else {
        	return "";
        }   
    }
    public static void main(String[] args)
    {
    	Scanner p=new Scanner(System.in);
    	out.println("Enter your Name,Acc_Number,Balance,Pin_number");
		String name=p.next();
		long accno=p.nextLong();
		double balance=p.nextDouble();
		int pinno=p.nextInt();
		Bankoperations a1= new Bankoperations(name,accno,balance,pinno);
    	while(true)
    	{
    		out.println("Enter your choice 1-deposit 2-withdraw 3-balanceamount");
    		int choice=p.nextInt();
    		switch(choice)
    		{
    		   case 1:
    		   {
    			   double amount=p.nextDouble();
    			   a1.deposit(amount);
    			  break;
    		   }
    		   case 2:
    		   {
    			   double amount=p.nextDouble();
    			   a1.withdraw(amount);
    			   break;
    		   }
    		   case 3:
    		   {
    			  String currentbal=a1.balanceamount();
    			  if(currentbal.equals(""))
    			  {
    				  out.println("oops wrong pin!!!!");
    			  }
    			  else {
    				  out.println("Your current blance:"+currentbal);
    			  }
    			 break;
    		   }
    		   default:
    		   {
    			   System.exit(0);
    			   break;
    		   }
    		}
    	}
         
    }
}


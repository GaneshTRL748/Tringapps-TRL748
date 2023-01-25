package students;
import java.util.Scanner;
public class Studentoperation
{
    Scanner p=new Scanner(System.in);
    String stuname;
    String dob;
    double gpa;
    char gradelevel;
    Studentoperation(String stuname,double gpa,char gradelevel,String dob)
    {
        this.stuname=stuname;
        this.gpa=gpa;
        this.gradelevel=gradelevel;
        this.dob=dob;
    }
    void updategpa(){
        double gpa1;
        if(validation()) {
        System.out.println("Enter yout current GpA:");
        gpa1=p.nextDouble();
        this.gpa=gpa1;
        System.out.println("GpA Updated Successfully!!!");
        }
        else {
        	System.out.print("Authentication Failed!!!!1");
        }
    }
    boolean validation()
    {
    	System.out.println("Enter your DOB TO Update GPA");
    	String dobv=p.nextLine();
    	if(this.dob.equals(dobv))
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    String display()
    {
        return this.stuname+" has a "+Double.toString(this.gpa)+" GPA";
    }
	public static void main(String[] args) {
	 Studentoperation a1=new Studentoperation("ganesh",8.0,'B',"20.11.2001");
	 a1.updategpa();
	 System.out.println(a1.display());
	}
}

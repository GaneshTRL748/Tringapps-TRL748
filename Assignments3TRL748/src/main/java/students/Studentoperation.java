package students;
import java.util.Scanner;
import java.util.logging.Logger;
public class Studentoperation
{
	Logger l= Logger.getLogger("com.api.jar");
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
          l.info("Enter yout current GpA:");
        gpa1=p.nextDouble();
        this.gpa=gpa1;
        l.info("GpA Updated Successfully!!!");
        }
        else {
        	l.info("Authentication Failed!!!!1");
        }
    }
    boolean validation()
    {
    	l.info("Enter your DOB TO Update GPA");
    	String dobv=p.nextLine();
    	if(this.dob.equals(dobv))
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    String Display()
    {
        return this.stuname+" has a "+Double.toString(this.gpa)+" GPA";
    }
	public static void main(String[] args) {
		Logger l= Logger.getLogger("com.api.jar");
	 Studentoperation a1=new Studentoperation("ganesh",8.0,'B',"20.11.2001");
	 a1.updategpa();
	 l.info(a1.Display());
	}
}

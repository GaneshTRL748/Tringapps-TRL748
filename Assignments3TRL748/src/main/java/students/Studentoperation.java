package students;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Studentoperation
{
	static PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
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
          out.println("Enter yout current GpA:");
        gpa1=p.nextDouble();
        this.gpa=gpa1;
        out.println("GpA Updated Successfully!!!");
        }
        else {
        	out.println("Authentication Failed!!!!1");
        }
    }
    boolean validation()
    {
    	out.println("Enter your DOB TO Update GPA");
    	String dobv=p.nextLine();
    	return (this.dob.equals(dobv));
    }
    String display()
    {
        return this.stuname+" has a "+Double.toString(this.gpa)+" GPA";
    }
	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		out.println("Enter your name and gpa and grade and dob");
	   String name=p.next();
	   double gpa=p.nextDouble();
	   char grade=p.next().charAt(0);
	   String dob=p.next();
	 Studentoperation a1=new Studentoperation(name,gpa,grade,dob);
	 a1.updategpa();
	 out.println(a1.display());
	}
}

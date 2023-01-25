package Students;
import java.util.*;
public class StudentsOperation
{
    Scanner p=new Scanner(System.in);
    String StuName,DOB;
    double GpA;
    char GradeLevel;
    StudentsOperation(String StuName,double GpA,char GradeLevel,String DOB)
    {
        this.StuName=StuName;
        this.GpA=GpA;
        this.GradeLevel=GradeLevel;
        this.DOB=DOB;
    }
    void UpdateGpA(){
        double GpA1;
        if(Validation()) {
        System.out.println("Enter yout current GpA:");
        GpA1=p.nextDouble();
        this.GpA=GpA1;
        System.out.println("GpA Updated Successfully!!!");
        }
        else {
        	System.out.print("Authentication Failed!!!!1");
        }
    }
    boolean Validation()
    {
    	System.out.println("Enter your DOB TO Update GPA");
    	String DOBV=p.nextLine();
    	if(this.DOB.equals(DOBV))
    	{
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    String Display()
    {
        String Str1=this.StuName+" has a "+Double.toString(this.GpA)+" GPA";
        return Str1;
    }
	public static void main(String[] args) {
	 StudentsOperation A1=new StudentsOperation("ganesh",8.0,'B',"20.11.2001");
	 A1.UpdateGpA();
	 System.out.println(A1.Display());
	}
}


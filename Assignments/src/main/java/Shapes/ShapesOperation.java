package Shapes;
public class ShapesOperation
{
    double Triangle,Rectangle,Circle;
    int Length,Width,Radius,Base,Height,SideLength;
    ShapesOperation(int Radius)
    {
       this.Radius=Radius; 
       System.out.println("Circle Successfully created");
    }
    ShapesOperation(int SideLength,int Base,int Height)
    {
        this.SideLength=SideLength;
        this.Base=Base;
        this.Height=Height;
        System.out.println("Triangle Successfully created");
    }
    ShapesOperation(int Length,int Width)
    {
        this.Length=Length;
        this.Width=Width;
        System.out.println("Rectangle Successfully created");
    }
    double Area(int Choise)
    {
        if(Choise==1){
            Circle=3.14115* this. Radius * this.Radius;
           return Circle;
        }
        else if(Choise==2)
        {
            Rectangle=this.Length * this.Width;
            return Rectangle;
        }
        else if(Choise==3)
        {
            Triangle= 0.5 * this.Base * this.Height;
            return Triangle;
        }
        else{
            System.out.println("Please Give some Choise");
            return 0;
        }
    }
    double PeriMeter(int Choise)
    {
        if(Choise==1)
        {
            Circle=2 * 3.14115 * this.Radius;
            return Circle;
        }
        else if(Choise==2)
        {
            Rectangle=(this.Length+this.Width) * 2;
            return Rectangle;
        }
        else if(Choise==3)
        {
            Triangle=this.Base + this.Height + this.SideLength;
            return Triangle;
        }
        else{
            System.out.println("Please Give some Choise");
            return 0;
        }
    }
       public static void main(String[] args) {
	   ShapesOperation A1=new ShapesOperation(10);
	   ShapesOperation A2=new ShapesOperation(8,4,5);
	   ShapesOperation A3=new ShapesOperation(10,20);
	   System.out.println("Area of Circle:"+A1.Area(1));
	   System.out.println("Area of Rectangle:"+A3.Area(2));
	   System.out.println("Area of Triangle:"+A2.Area(3));
	   System.out.println("PeriMeter of Circle:"+A1.PeriMeter(1));
	   System.out.println("PeriMeter of Rectangle:"+A3.PeriMeter(2));
	   System.out.println("Perimeter of Triangle:"+A2.PeriMeter(3));
	}
}


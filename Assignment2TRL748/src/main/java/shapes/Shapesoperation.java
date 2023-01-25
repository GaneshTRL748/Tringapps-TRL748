package shapes;

public class Shapesoperation {
	double triangle;
	double rectangle;
	double circle;
    double length,width,radius,base,height,sidelength;
    Shapesoperation(double radius)
    {
       this.radius=radius; 
       System.out.println("Circle Successfully created");
    }
    Shapesoperation(double sidelength,double base,double height)
    {
        this.sidelength=sidelength;
        this.base=base;
        this.height=height;
        System.out.println("Triangle Successfully created");
    }
    Shapesoperation(double length,double width)
    {
        this.length=length;
        this.width=width;
        System.out.println("Rectangle Successfully created");
    }
    double area(int Choise)
    {
        if(Choise==1){
            circle=3.14115* this. radius * this.radius;
           return circle;
        }
        else if(Choise==2)
        {
            rectangle=this.length * this.width;
            return rectangle;
        }
        else if(Choise==3)
        {
            triangle= 0.5 * this.base * this.height;
            return triangle;
        }
        else{
            System.out.println("Please Give some Choise");
            return 0;
        }
    }
    double perimeter(int Choise)
    {
        if(Choise==1)
        {
            circle=2*3.14115*this.radius;
            return circle;
        }
        else if(Choise==2)
        {
            rectangle=(this.length+this.width)*2;
            return rectangle;
        }
        else if(Choise==3)
        {
            triangle=this.base + this.height+this.sidelength;
            return triangle;
        }
        else{
            System.out.println("Please Give some Choise");
            return 0;
        }
    }
       public static void main(String[] args) {
	   Shapesoperation a1=new Shapesoperation(10);
	   Shapesoperation a2=new Shapesoperation(8,4,5);
	   Shapesoperation a3=new Shapesoperation(10,20);
	   System.out.println("Area of Circle:"+a1.area(1));
	   System.out.println("Area of Rectangle:"+a3.area(2));
	   System.out.println("Area of Triangle:"+a2.area(3));
	   System.out.println("PeriMeter of Circle:"+a1.perimeter(1));
	   System.out.println("PeriMeter of Rectangle:"+a3.perimeter(2));
	   System.out.println("Perimeter of Triangle:"+a2.perimeter(3));
	}
}

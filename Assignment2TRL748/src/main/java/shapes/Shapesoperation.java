package shapes;

public class Shapesoperation {
	double triangle;
	double rectangle;
	double circle;
    double length;
    double width;
	double radius;
	double base;
	double height;
	double sidelength;
    Shapesoperation(double radius)
    {
       this.radius=radius; 
       logger.log("Circle Successfully created");
    }
    Shapesoperation(double sidelength,double base,double height)
    {
        this.sidelength=sidelength;
        this.base=base;
        this.height=height;
        logger.log("Triangle Successfully created");
    }
    Shapesoperation(double length,double width)
    {
        this.length=length;
        this.width=width;
        logger.log("Rectangle Successfully created");
    }
    double area(int choise)
    {
        if(choise==1){
            circle=3.14115* this. radius * this.radius;
           return circle;
        }
        else if(choise==2)
        {
            rectangle=this.length * this.width;
            return rectangle;
        }
        else if(choise==3)
        {
            triangle= 0.5 * this.base * this.height;
            return triangle;
        }
        else{
            logger.log("Please Give some Choise");
            return 0;
        }
    }
    double perimeter(int choise)
    {
        if(choise==1)
        {
            circle=2*3.14115*this.radius;
            return circle;
        }
        else if(choise==2)
        {
            rectangle=(this.length+this.width)*2;
            return rectangle;
        }
        else if(choise==3)
        {
            triangle=this.base + this.height+this.sidelength;
            return triangle;
        }
        else{
              logger.log("Please Give some Choise");
            return 0;
        }
    }
       public static void main(String[] args) {
	   Shapesoperation a1=new Shapesoperation(10);
	   Shapesoperation a2=new Shapesoperation(8,4,5);
	   Shapesoperation a3=new Shapesoperation(10,20);
	   logger.log("Area of Circle:"+a1.area(1));
	   logger.log("Area of Rectangle:"+a3.area(2));
	   logger.log("Area of Triangle:"+a2.area(3));
	   logger.log("PeriMeter of Circle:"+a1.perimeter(1));
	   logger.log("PeriMeter of Rectangle:"+a3.perimeter(2));
	   logger.log("Perimeter of Triangle:"+a2.perimeter(3));
	}
}

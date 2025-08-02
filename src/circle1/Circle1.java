package circle1;

class Circle
{
    public int radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
    
}

class Cylinder extends Circle
{
    public int hight;
    public double valume()
    {
        return area()*hight;
    }
}
public class Circle1 
{

    public static void main(String[] args) 
    {
        Cylinder cy=new Cylinder();
        cy.radius = 5;
        cy.hight = 12;
        
        System.out.println("Valume of Cylinder : "+cy.valume());
        System.out.println("Area of Cylinder : "+cy.area());
        System.out.println("Perimeter of Cylinder : "+cy.perimeter());
        System.out.println("Circumference of Cylinder : "+cy.circumference());
    }
    
}

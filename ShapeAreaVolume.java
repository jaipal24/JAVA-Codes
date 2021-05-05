/*
Shape - Area Volume Calculator
Create an abstract public class Shape with the below public abstract methods :
     public double area() 
     public double volume()
Create a public class Rectangle with private attributes :
       double length
      double width
Write the public getters and setters for these attributes.
Rectangle class should inherit the Shape class
      Area of rectangle is length * width
Create a public class Triangle with private attributes :
      double base
      double height
Write the public getters and setters for these attributes.
Triangle class should inherit the Shape class
      Area of triangle is  1/2 * base * height
 Create a public class Cube with private attributes :
      double length
     double width
     double height
 Write the public getters and setters for these attributes.
  Cube class should inherit the Shape class
      Area of cube is  2 * length * width + 2 * length * height + 2* width * height
      Volume of cube is  length * width * height
 Create a public class Sphere with private attributes :
      double radius
 Write the public getters and setters for these attributes.
 Sphere class should inherit the Shape class
        Area of  Sphere is  4  * PI * radius2
        Volume of Sphere is   ( 4  * PI * radius3 ) / 3
 Note : You should use Math.PI for the value of PI
For Rectangle and Triangle class the method volume should return -1.
Create an interface Spatial which is a marker interface. Classes that has proper implementation for volume should implement this interface.
 Create a public Main class which has the main method.
 Create an array of Shape of size 5.
 Get the Shape type and the corresponding attributes and store those objects in the array.
  Print the area and volume of the objects created.
  Volume of the array object should be printed only if it is of Spatial Type.
 Sample Input :
 Triangle
10
20
Sphere
14
Rectangle
14
15
Cube
5
7
9
Triangle
18
24
Sample Output
Area 100.0
Area 2463.0086404143976
Volume 11494.040321933855
Area 210.0
Area 286.0
Volume 315.0
Area 216.0
Note : Volume is displayed only when the shape is cube or sphere 
*/

import java.util.*;
public class ShapeAreaVolume
{
    public static void main(String args[])
    {
        String shape[]=new String[5];
        Scanner sc=new Scanner(System.in);
        String str;
        for(int i=0;i<5;i++)
        {
            str=sc.next();
            shape[i]=str;
            if(str.equals("Triangle"))
            {  
                double a=sc.nextInt();
                double b=sc.nextInt();
                Triangle t1=new Triangle();
                t1.setBase(a);
                t1.setHeight(b);
                System.out.println("Area"+t1.area());
            }
            else if(str.equals("Sphere"))
            {
                double r=sc.nextInt();
                Sphere s1=new Sphere();
                s1.setRadius(r);
                System.out.println("Area"+s1.area());
                System.out.println("Volume"+s1.volume());
            }
            else if(str.equals("Rectangle"))
            {
                double l=sc.nextInt();
                double b=sc.nextInt();
                Rectangle r1=new Rectangle();
                r1.setLength(l);
                r1.setWidth(b);
                System.out.println("Area"+r1.area());
            }
            else if(str.equals("Cube"))
            {
                double l,w,h;
                l=sc.nextInt();
                w=sc.nextInt();
                h=sc.nextInt();
                Cube c1=new Cube();
                c1.setLength(l);
                c1.setWidth(w);
                c1.setHeight(h);
                System.out.println("Area"+c1.area());
                System.out.println("Volume"+c1.volume());
            }
        }
    }
}

public class Cube implements Spatial
{
    private double length;
    private double width;
    private double height;
    public double getLength()
    {
        return length;
    }
    public void setLength(double val)
    {
        this.length=val;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double val)
    {
        this.width=val;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double val)
    {
        this.height=val;
    }
    public double area()
    {
        return ((2*this.length*this.width)+(2*this.length*this.height)+(2*this.height*this.width));
    }
    public double volume()
    {
        return this.length*this.width*this.height;
    }
}

public class Rectangle extends Shape
{
    private double length;
    private double width;
    public double getLength()
    {
        return length;
    }
    public void setLength(double val)
    {
        this.length=val;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double val)
    {
        this.width=val;
    }
    public double area()
    {
        return (this.length*this.width);
    }
    public double volume()
    {
        return -1;
    }
}

public abstract class Shape
{
      public abstract double area();
      public abstract double volume();
}

public interface Spatial
{
    
}

public class Sphere implements Spatial
{
    private double radius;
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double val)
    {
        this.radius=val;
    }
    public double area()
    {
        return (4*Math.PI*this.radius*this.radius);
    }
    public double volume()
    {
        return ((4*Math.PI*this.radius*this.radius*this.radius)/3);
    }
}

public class Triangle extends Shape
{
    private double base;
    private double height;
    public double getBase()
    {
        return base;
    }
    public void setBase(double val)
    {
        this.base=val;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double val)
    {
        this.height=val;
    }
    public double area()
    {
        return (this.base*this.height*0.5);
    }
    public double volume()
    {
        return -1;
    }
}
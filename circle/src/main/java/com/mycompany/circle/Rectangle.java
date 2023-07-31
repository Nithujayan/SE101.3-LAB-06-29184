package com.mycompany.circle;
class Rectangle implements Shape
{
    private double length;
    private double width;
   
   public Rectangle(double length,double width)
   {
       this.length=length;
       this.width=width;
   }
     
   public void setlength(double length)
   {
       this.length=length;
   }
   public void setwidth(double width)
   {
       this.width=width;
   }
    double getwidth()
    {
       return width;
    }
    double getlength()
    {
        return width;
    }
    
   @Override
    public double calculateArea()
    {
        return length*width;
    }
   @Override
    public double calculatePerimeter()
    {
        return 2 * (length*width);
    }
}

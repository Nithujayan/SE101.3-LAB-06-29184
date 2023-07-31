
package com.mycompany.circle;
public class Crcle implements Shape
{
   private double radious;
   
   public Crcle(double radious)
   {
       this.radious=radious;
   }
     
   public void setcrcle(double crcle)
   {
       this.radious=radious;
   }
    double getradious()
    {
       return radious;
    }
    
   @Override
    public double calculateArea()
    {
        return Math.PI * radious * radious;
    }
   @Override
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radious;
    }
   
}

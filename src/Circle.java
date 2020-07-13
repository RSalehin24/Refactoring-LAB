import java.lang.Math.*;

public class Circle implements Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

public class Square implements Shape{
    private double length;

    Square(double length){
        this.length = length;
    }

    public double perimeter(){
        return 4*length;
    }
    public double area(){
        return length*length;
    }
}

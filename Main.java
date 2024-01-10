class Rectangle{
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
}
 class Square extends Rectangle{
    public Square(double side){
        super(side, side);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,50);
        System.out.println("The area of Rectangle is: "+r.getArea());
        System.out.println("The perimeter of Rectangle is: "+r.getPerimeter());

        Square s = new Square(10);
        System.out.println("The area of Square is: "+s.getArea());
        System.out.println("The perimeter of Square is: "+s.getPerimeter());
    }
}
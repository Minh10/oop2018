package week5_6;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(int x,int y,double width,double length,String color) {
        super(x,y,color,"Rectangle");
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isRectangle() {
        return this.getName().equals("Rectangle");
    }

//    public boolean isSame(Triangle y) {
//        Rectangle x = (Rectangle) y;
//        if ((this.getToaDo().isSameP(x.getToaDo())) && (this.getWidth()==x.getWidth()) && (this.getLength()==x.getLength()) ) return true;
//        else return false;
//    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

}

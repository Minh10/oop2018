package week5_6;

public class Square extends Shape {
    private double side;

    public Square(int x,int y,double side,String color) {
        super(x,y,color,"Square");
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public boolean isSquare() {
        return this.getName().equals("Square");
    }

//    public boolean isSame(Triangle y) {
//        Square x = (Square) y;
//        if ((this.getToaDo().isSameP(x.getToaDo())) && (this.getSide()==x.getSide())) return true;
//        else return false;
//    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

}


package week5_6;

public abstract class Shape  {
    private String color ;
    private Point toaDo = new Point();
    private String name ;

    public Shape(int x,int y,String color,String name) {
        this.color = color;
        this.name = name;
        this.toaDo.setX(x);
        this.toaDo.setY(y);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getToaDo(){
        return this.toaDo;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setToaDo(Point xy) {
        this.toaDo.setX(xy.getX());
        this.toaDo.setY(xy.getY());
    }


    public void move(Point xy) {
        this.toaDo.setX(xy.getX());
        this.toaDo.setY(xy.getY());
    }
    public boolean isTriangle() {return false;}
    public boolean isRectangle() {return false;}
    public boolean isSquare() {return false;}
    public boolean isCircle() {return false;}
    public boolean isHexagon() {return false;}

    @Override
    public String toString() {
        return "Shape ";
    }
}

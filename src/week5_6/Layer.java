package week5_6;

import java.util.ArrayList;

public class Layer {
    ArrayList<Shape> Shapes = new ArrayList();
    private boolean visible = true;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    Layer() {
        this.Shapes = new ArrayList();
        this.Shapes.add(new Rectangle(0,0,10,5,"red"));
        this.Shapes.add(new Circle(5,6,8,"blue"));
        this.Shapes.add(new Triangle(1,1,2,2,3,3, "green"));
        this.Shapes.add(new Square(3,4,5, "yellow"));
        this.Shapes.add(new Rectangle(0,0,10,5,"red"));
        this.Shapes.add(new Circle(5,6,8,"blue"));
        this.Shapes.add(new Triangle(1,1,2,2,3,3, "green"));
        this.Shapes.add(new Square(3,4,5, "yellow"));

    }
    /**
     * Delete all Triangle
     */
    public void deleteTriangle() {
        for (int i = this.Shapes.size() - 1; i >= 0; i--) {
            if (this.Shapes.get(i) instanceof Triangle) {
                this.Shapes.remove(i);
            }
        }
    }

    /**
     * Delete all Circle
     */
    public void deleteCircle() {
        for (int i = this.Shapes.size() - 1; i >= 0; i--) {
            if (this.Shapes.get(i) instanceof Circle) {
                this.Shapes.remove(i);
            }
        }
    }

//    public void deleteSame() {
//        for (int i = 0; i < this.Shapes.size()-1; i++ ) {
//            for (int j = i; i < this.Shapes.size(); i++ ) {
//                if (
//                        this.Shapes.get(i).isCircle() &&
//                                this.Shapes.get(j).isCircle() &&
//                                ((Circle)this.Shapes.get(i)).isSame(this.Shapes.get(j))
//                )
//                    this.Shapes.remove(i);
//
//
//                if (
//                        this.Shapes.get(i).isRectangle() &&
//                                this.Shapes.get(j).isRectangle() &&
//                                ((Rectangle)this.Shapes.get(i)).isSame()
//                )
//                    this.Shapes.remove(i);
//
//
//                if (
//                        this.Shapes.get(i).isTriangle() &&
//                                this.Shapes.get(j).isTriangle() &&
//                                ((Triangle)this.Shapes.get(i)).isSame(this.Shapes.get(j))
//                )
//                    this.Shapes.remove(i);
//
//
//                if (
//                        this.Shapes.get(i).isSquare() &&
//                                this.Shapes.get(j).isSquare() &&
//                                ((Square)this.Shapes.get(i)).isSame(this.Shapes.get(j))
//                )
//                    this.Shapes.remove(i);
//            }
//        }
//    }

    public deleteTriangle() {
        for(int i=0; i<this.Shapes.size(); i++) {
            if(this.Shapes.get(i) instanceof Triangle) {
                this.Shapes.remove(i);
                i--;
            }
        }
    }
    public String toString() {
        String s = "";

        for (int i = this.Shapes.size() - 1; i >= 0; i--)
            s+= this.Shapes.get(i).toString();

        return s;
    }
}
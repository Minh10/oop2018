package week5_6;


    public class Circle extends Shape{
        private double radius = 1.0 ;
        static final double PI = 3.1415;

        public Circle() {
            super(0, 0, "Red", "Circle");
        }


        public Circle(int x,int y,double ra,String color) {
            super(x,y,color,"Circle");
            this.radius = ra;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public boolean isCircle() {
            return this.getName().equals("Circle");
        }

//        public boolean isSame(Triangle y) {
//            Circle x = (Circle) y;
//            if ((this.getToaDo().isSameP(x.getToaDo())) && (this.getRadius()==x.getRadius())) return true;
//            else return false;
//        }

        @Override
        public String toString() {
            return "Circle{" + "radius=" + radius + '}';
        }

    }



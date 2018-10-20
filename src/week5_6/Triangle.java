package week5_6;

    public class Triangle extends Shape{
        private Point a = new Point(), b = new Point(), c = new Point();

        public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, String color) {
            super(x1, y1, color, "Triangle");
            this.a.setToaDo(x1, y1);
            this.b.setToaDo(x2, y2);
            this.c.setToaDo(x3, y3);
        }


        public Point getA() {
            return a;
        }

        public void setA(Point a) {
            this.a = a;
        }

        public Point getB() {
            return b;
        }

        public void setB(Point b) {
            this.b = b;
        }

        public Point getC() {
            return c;
        }

        public void setC(Point c) {
            this.c = c;
        }

//        public boolean isSame(Triangle y) {
//            Triangle x = (Triangle) y;
//            if (
//                    (this.getA().isSameP(x.getA())) &&
//                            (this.getB().isSameP(x.getB())) &&
//                            (this.getC().isSameP(x.getC()))
//            ) return true;
//            else return false;
//        }

        @Override
        public String toString() {
            return "Triagle ";
        }
    }







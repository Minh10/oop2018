package week5_6;


    import java.util.ArrayList;


    public class Diagram {

        ArrayList<Layer> layers;


        Diagram() {
            this.layers = new ArrayList<Layer>();
            this.layers.add(new Layer());
            this.layers.add(new Layer());
            this.layers.add(new Layer());
            this.layers.add(new Layer());
            this.layers.add(new Layer());
            this.layers.add(new Layer());
        }

        public void deleteCircle() {
            for (Layer layer : this.layers) {
                layer.deleteCircle();
            }
        }

        public String toString() {
            String ans = "";
            for (Layer layer : this.layers) {
                ans = ans + layer.toString() + "\n";
            }
            return ans;
        }

        public void Sort() {
            Layer tron = new Layer();
            Layer vuong = new Layer();
            Layer hcn = new Layer();
            Layer lgiac = new Layer();
            Layer tgiac = new Layer();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < layers.get(i).Shapes.size(); j++) {
                    if (layers.get(i).Shapes.get(j).isCircle()) tron.Shapes.add(layers.get(i).Shapes.get(j));
                    else if (layers.get(i).Shapes.get(j).isSquare()) vuong.Shapes.add(layers.get(i).Shapes.get(j));
                    else if (layers.get(i).Shapes.get(j).isRectangle()) hcn.Shapes.add(layers.get(i).Shapes.get(j));
                    else if (layers.get(i).Shapes.get(j).isTriangle()) tgiac.Shapes.add(layers.get(i).Shapes.get(j));

                }
            }

            layers.add(tron);
            layers.add(vuong);
            layers.add(hcn);
            layers.add(lgiac);
            layers.add(tgiac);
        }
    }

import java.util.ArrayList;

    public class Farm {
    private int flowerTypeMaxAmount = 5;
    private ArrayList<Flower> flowers;
    private int size;

    public Farm(int flowerTypeMaxAmount, ArrayList<Flower> flowers, int size) {
        this.flowerTypeMaxAmount = flowerTypeMaxAmount;
        this.flowers = flowers;
        this.size = size;
    }

        public int getFlowerTypeMaxAmount() {
            return flowerTypeMaxAmount;
        }

        public void setFlowerTypeMaxAmount(int flowerTypeMaxAmount) {
            this.flowerTypeMaxAmount = flowerTypeMaxAmount;
        }

        public ArrayList<Flower> getFlowers() {
            return flowers;
        }

        public void setFlowers(ArrayList<Flower> flowers) {
            this.flowers = flowers;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }

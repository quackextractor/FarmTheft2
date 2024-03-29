import java.util.ArrayList;
import java.util.concurrent.Flow;

public class Farm {
    private int flowerTypeMaxAmount = 5;
    private ArrayList<Flower> flowers;
    private int haSize;

    public Farm(int flowerTypeMaxAmount, int haSize) {
        this.flowerTypeMaxAmount = flowerTypeMaxAmount;
        this.haSize = 100;
    }

    public void plantFlower(Flower flower) {
        if ((haSize - flower.neededArea) <= 0) {
            throw new UnsupportedOperationException("Not enough space available to commit to planting.");
        } else {
            haSize -= flower.neededArea;
            flowers.add(flower);
        }
    }

    public double calculateChanceOfGrowth(Flower flower) {
        double chance = flower.chanceOfGrowth;

        chance += 30;
        if (chance > 100) {
            chance = 100;
        }
        return chance;
    }

    public void waterFlower(String targetFlowerName) {

        boolean hasFoundFlowers = false;
        for (Flower flower : flowers
        ) {
            if (flower.name.equals(targetFlowerName)) {
                if (flower.chanceOfGrowth >= 100) {
                    throw new UnsupportedOperationException("Flower does not need watering.");
                } else {
                    flower.chanceOfGrowth = calculateChanceOfGrowth(flower);
                    hasFoundFlowers = true;
                }
            }
        }
        if (!hasFoundFlowers){
            throw new UnsupportedOperationException("No such flower.");
        }
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

    public int getHaSize() {
        return haSize;
    }

    public void setHaSize(int haSize) {
        this.haSize = haSize;
    }
}

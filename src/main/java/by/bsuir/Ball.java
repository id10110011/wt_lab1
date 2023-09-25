package by.bsuir;

public class Ball {
    private int weight;
    private BallColor color;

    public Ball(int weight, BallColor color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public BallColor getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(BallColor color) {
        this.color = color;
    }
}

package by.bsuir;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public long countWeight() {
        long weight = 0;
        for (Ball ball : this.balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int countAmountBlueBalls() {
        int amount = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == BallColor.BlUE) {
                amount++;
            }
        }
        return amount;
    }
}

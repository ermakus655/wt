package lab1.t9;

import java.util.ArrayList;

public class Basket {
    private int weight;
    private int capacity;
    private ArrayList<Ball> Balls = new ArrayList<Ball>();

    public void addBall(Ball ball){
        Balls.add(ball);
    }

    public int countOfBlue(){
        int count = 0;
        for (Ball ball : Balls) {
            if (ball.color.equals("Blue")) {
                count++;
            }
        }
        return count;
    }

    public int calculateWeight(){
        return Balls.size();
    }
}




package lab1.t9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ball ball1 = new Ball("Red");
        Ball ball2 = new Ball("Blue");
        Ball ball3 = new Ball("Blue");
        Ball ball4 = new Ball("Blue");
        Ball ball5 = new Ball("Green");
        Ball ball6 = new Ball("Green");

        Basket basket = new Basket();
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);
        basket.addBall(ball5);
        basket.addBall(ball6);
        System.out.println(basket.countOfBlue());
        System.out.println(basket.calculateWeight());
    }
}

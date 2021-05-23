import processing.core.PApplet;


public class FourBalls extends PApplet {

    private static final int HEIGHT = 480;
    private static final int DIAMETER = 100;

    public void draw(int circleSpeed) {
        ellipse(circleSpeed, HEIGHT / 5, DIAMETER, DIAMETER);
        ++circleSpeed;
    }
}

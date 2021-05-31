import processing.core.PApplet;

public class Ball {
    public static final int DIAMETER = 10;
    public static PApplet pApplet;
    int xPosition;
    int yPosition;
    int unitsPerFrame;

    public Ball(int yPosition, int unitsPerFrame, PApplet p) {
        this.yPosition = yPosition;
        this.xPosition = 0;
        this.unitsPerFrame = unitsPerFrame;
        pApplet = p;
    }

    public void incrementBallSpeed() {
        xPosition += unitsPerFrame;
    }

    public void move() {
        pApplet.ellipse(xPosition, yPosition, DIAMETER, DIAMETER);
        incrementBallSpeed();
    }
}

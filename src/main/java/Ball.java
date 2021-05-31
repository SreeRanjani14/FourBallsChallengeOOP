import processing.core.PApplet;

public class Ball {
    public static final int DIAMETER = 10;
    int xPosition;
    int yPosition;
    int unitsPerFrame;

    public Ball(int yPosition, int unitsPerFrame) {
        this.yPosition = yPosition;
        this.xPosition = 0;
        this.unitsPerFrame = unitsPerFrame;
    }

    public void incrementBallSpeed() {
        xPosition += unitsPerFrame;
    }

    public void move(PApplet pApplet) {
        pApplet.ellipse(xPosition, yPosition, DIAMETER, DIAMETER);
        incrementBallSpeed();
    }
}

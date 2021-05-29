import processing.core.PApplet;

public class Ball extends PApplet {
    public static final int DIAMETER = 10;
    int ballPosition;
    int ballSpeed;
    int unitsPerFrame;

    public Ball(int ballPosition, int unitsPerFrame) {
        this.ballPosition = ballPosition;
        this.ballSpeed = 0;
        this.unitsPerFrame = unitsPerFrame;
    }

    public void incrementBallSpeed() {
        ballSpeed += unitsPerFrame;
    }
}

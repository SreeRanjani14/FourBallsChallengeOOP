import processing.core.PApplet;


public class FourBalls extends PApplet {
    int ballPosition;
    int diameter;
    int ballSpeed;
    int unitsPerFrame;

    public FourBalls(int ballPosition, int diameter, int unitsPerFrame) {
        this.ballPosition = ballPosition;
        this.diameter = diameter;
        this.ballSpeed = 0;
        this.unitsPerFrame = unitsPerFrame;
    }

    public void incrementBallSpeed() {
        ballSpeed += unitsPerFrame;
    }
}

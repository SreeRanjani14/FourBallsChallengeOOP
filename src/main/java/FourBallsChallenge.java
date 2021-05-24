import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int BALLCOUNT = 4;
    int unitsPerFrame = 1;

    FourBalls[] fourBalls = new FourBalls[BALLCOUNT];

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        initialSetup();
    }

    private void initialSetup() {
        for (int i = 1; i <= BALLCOUNT; i++) {
            fourBalls[i - 1] = new FourBalls(i * HEIGHT / 5, DIAMETER, unitsPerFrame);
            incrementUnitsPerFrame();
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < BALLCOUNT; i++) {
            moveBalls(fourBalls[i]);
        }
    }

    private void moveBalls(FourBalls fourBalls) {
        ellipse(fourBalls.ballSpeed, fourBalls.ballPosition, fourBalls.diameter, fourBalls.diameter);
        fourBalls.incrementBallSpeed();
    }

    private void incrementUnitsPerFrame() {
        unitsPerFrame += 1;
    }

}

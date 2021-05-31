import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BALL_COUNT = 4;
    public static final int FRAME = 5;

    int unitsPerFrame = 1;

    Ball[] ball = new Ball[BALL_COUNT];

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
        for (int index = 1; index <= BALL_COUNT; index++) {
            ball[index - 1] = new Ball(HEIGHT * index / FRAME, unitsPerFrame);
            incrementUnitsPerFrame();
        }
    }

    @Override
    public void draw() {
        for (int index = 0; index < BALL_COUNT; index++) {
            ball[index].move(this);
        }
    }

    private void incrementUnitsPerFrame() {
        unitsPerFrame += 1;
    }

}

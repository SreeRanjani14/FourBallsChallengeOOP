import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {
    private final int circleSpeed = 0;

    public static void main(String[] args) {
        String[] processingArgs = {"MySketch"};
        FourBallsChallenge fourBallsChallenge = new FourBallsChallenge();
        PApplet.runSketch(processingArgs, fourBallsChallenge);
    }

    final int WIDTH = 640;
    final int HEIGHT = 480;
    FourBalls fourBalls1;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        fourBalls1 = new FourBalls();
    }


    @Override
    public void draw() {
        fourBalls1.draw(circleSpeed + 1);
    }
}

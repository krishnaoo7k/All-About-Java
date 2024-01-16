package PracticeForAllForSpring.Constructor;

public class Main {
    public static void main(String[] args) {
        var kk = new MarioGame();
        var game = new PackMan();
        var k = new GameRunning(kk);
        k.run();

    }
}

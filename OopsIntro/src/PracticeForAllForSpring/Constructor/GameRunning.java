package PracticeForAllForSpring.Constructor;

public class GameRunning {
    MarioGame game ;

    GameRunning(MarioGame game){
        this.game = game;
    }
    public void run(){

        game.up();
        game.down();
    }

}

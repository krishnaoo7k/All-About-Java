package Interfaces;

public class NewCar {
   private Engine engine;
   private Media player  = new MediaPlayer();

   public NewCar(){
       engine = new PetrolCar();
   }

    public NewCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
       engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void musicPlayer(){
       player.start();
    }

    public void upgradeEngine(){
       this.engine  = new ElectricCar();
    }
}

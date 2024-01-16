package Methods;

public class SleepMethod extends Thread { // Hey, I m a sleep block and i m static so, you can call me by the class name i m not dependent on object
    public static void main(String[] args) {

        // just run the program then you will know about me

        System.out.println("my work is to put thread into a temporary waiting state For ex");
        System.out.println(" ");
        System.out.println("suppose you are going somewhere but in the middle of your way you meet your school friend");
        System.out.println(" ");
        System.out.println("so instead of going you will take a break for a minute to talk to him a little bit so u can do this by using me!!!! i mean sleep()");
        System.out.println(" ");
        System.out.println("talking to your friend so i m putting this program into sleep mode until you finish your conversation");
        try{
            SleepMethod.sleep(10000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("happy now after talking to your childhood frnd now lets move forward");

    }
}

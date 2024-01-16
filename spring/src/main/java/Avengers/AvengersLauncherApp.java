package Avengers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AvengersLauncherApp {
    public static void main(String[] args) {
      var thanos   = new AnnotationConfigApplicationContext(AvengersLauncherApp.class);

//      Questions you can ask to thanos

//         konHaiAvengers
//         tumKonHo
//         tumeKyaChaiye
//         kyaTumMereAngeTikPaoge
//         ghamoora
//         tumeLgtaHaiTumMujeHaraPaoge

// Right now thanos is talking to Thor bcz he is the @primary one
        System.out.println("Thor Says -_- ");
       thanos.getBean(Thanos.class).tumeLgtaHaiTumMujeHaraPaoge();





    }
}

package com.springpractice.spring.BusinessCalculationService;

//import RandomStuff.B;
import RandomStuff.Stuff;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("RandomStuff")
public class BusinessServiceLauncher {
    public static void main(String[] args) {
       var context =  new AnnotationConfigApplicationContext(BusinessServiceLauncher.class);
        System.out.println(context.getBean(Stuff.class));

//        System.out.println(context.getBean(BusinessCalculationService.class).findMax());
    }
}

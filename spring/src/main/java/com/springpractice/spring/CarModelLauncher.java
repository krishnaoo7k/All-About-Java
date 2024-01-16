package com.springpractice.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CarModelLauncher {
    public static void main(String[] args) {

     var context = new AnnotationConfigApplicationContext(CarModelLauncher.class);
        context.getBean(DifferentCarModels.class).run();
        context.getBean(ModelManager.class).carPrice();

    }
}

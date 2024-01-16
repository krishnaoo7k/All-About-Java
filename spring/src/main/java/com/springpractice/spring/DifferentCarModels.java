package com.springpractice.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DifferentCarModels {
private ModelManager car;

    public DifferentCarModels(@Qualifier("AudiQualifier")ModelManager car) {
        this.car = car;
    }
    public void run(){
        car.carName();
        car.carPrice();
        car.carRatings();
    }
}

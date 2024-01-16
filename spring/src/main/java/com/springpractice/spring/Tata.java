package com.springpractice.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Tata implements ModelManager {
    @Override
    public void carName() {
        System.out.println("Harrier");

    }

    @Override
    public void carPrice() {
        System.out.println("50 lack");

    }

    @Override
    public void carRatings() {
        System.out.println("Tata Ratings 5");

    }
}

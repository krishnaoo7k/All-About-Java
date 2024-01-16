package com.springpractice.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("AudiQualifier")
public class Audi implements ModelManager{
    @Override
    public void carName() {
        System.out.println("Q6 Series");

    }

    @Override
    public void carPrice() {
        System.out.println("72 lack");

    }

    @Override
    public void carRatings() {
        System.out.println("Audi Ratings 4.2");

    }
}

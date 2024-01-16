package com.springpractice.spring.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService implements DataService{


    @Override
    public int[] retrieveData() {
        return new int[0];
    }

    private DataService dataService;

    public BusinessCalculationService(@Qualifier("MongoDbDataService") DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}

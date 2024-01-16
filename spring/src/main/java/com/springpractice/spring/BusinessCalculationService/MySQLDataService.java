package com.springpractice.spring.BusinessCalculationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySQLDataService implements DataService{
    public int[] retrieveData(){
return new int[] { 1, 2, 3, 4, 5 };
    }

}

package RandomStuff;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){ };


@Configuration
public class SpringConfig {

    @Bean//(name = "hello")
    public String name(){
        return "krishna";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean Person person(String name, int age){
        return new Person("Sharma", 24);
    }

    @Bean Person pperson(){
        return new Person("Sharma", 24);
    }


}

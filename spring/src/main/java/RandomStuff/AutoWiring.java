package RandomStuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoWiring {

@Autowired
private String name;
    @Bean
    public String age(){
        return name + " 22";
    }
}

package RandomStuff;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class MyClass {
    @PostConstruct
    public void init() {
        // Initialization code goes here
        System.out.println("Object initialized");
    }
}

@Configuration
public class SpringApplication {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SpringApplication.class);

        System.out.println(context.getBean(MyClass.class));



//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}

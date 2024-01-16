package RandomStuff;

import org.springframework.stereotype.Component;

@Component
public class Stuff {
    private String name = "krishna";

    public String getName() {
        return name;
    }
}
@Component
 class B {
//    @Autowired
    private Stuff a;

    public B(Stuff a) {
        this.a = a;
    }

    public void printName() {
        System.out.println(a.getName());
    }
}
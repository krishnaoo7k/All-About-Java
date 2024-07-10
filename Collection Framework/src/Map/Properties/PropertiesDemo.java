package Map.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("/home/raghav/prop.txt");
        p.load(fis);
        System.out.println(p);
        System.out.println(p.getProperty("12"));
        p.setProperty("10","Sharma");
        FileOutputStream fos = new FileOutputStream("/home/raghav/prop.txt");
        p.store(fos," the changes are updated");
    }
}

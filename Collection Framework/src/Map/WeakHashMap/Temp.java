package Map.WeakHashMap;

public class Temp {
    public String toString(){
        return "temp";
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("garbage collection called");
    }

}

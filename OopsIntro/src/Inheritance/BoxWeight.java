package Inheritance;

public class BoxWeight extends Box{  //Inheritance can be done using extends + parent class name ** class should not be private
    int weight;
    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(int l, int w, int h, int weight) {
        super(l, w, h); // this can be used to call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;

    }
}







